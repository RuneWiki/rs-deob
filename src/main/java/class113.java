import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class113 extends class217 {

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Ltj;")
    public class157 field1977;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "[I")
    public static int[] field1979 = new int[128];

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Llc;")
    public static class143 field1983 = class66.method374("Lade Titelbild )2 ", -1);

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
    public static final void method676(int arg0) {
        field1980++;
        if (arg0 >= -109) {
            return;
        }
        int var1 = class239.field4326.method1308(class130.field2307);
        for (int var2 = 0; var2 < class257.field4625; var2++) {
            int var6 = class239.field4326.method1308(class263.method1752(7021, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class257.field4625 * 15 + 21;
        int var4 = class251.field4522 - (var1 / 2);
        if ((var1 + var4) > class10.field222) {
            var4 = class10.field222 - var1;
        }
        int var5 = class12.field233;
        if (class269.field4820 < var3 + var5) {
            var5 = class269.field4820 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class112.field1974 != 1) {
            if (class31.field499 != class251.field4522 || class67.field1279 != class12.field233) {
                class159.field2874 = class67.field1279;
                class87.field1590 = class31.field499;
                class112.field1974 = 1;
                return;
            }
            class128.field2271 = var4;
            class52.field1023 = var1;
            class139.field2415 = true;
            class112.field1974 = 0;
            class24.field417 = var5;
            class176.field3167 = class257.field4625 * 15 + 22;
        } else if (class87.field1590 == class251.field4522 && class159.field2874 == class12.field233) {
            class52.field1023 = var1;
            class176.field3167 = class257.field4625 * 15 + 22;
            class139.field2415 = true;
            class24.field417 = var5;
            class112.field1974 = 0;
            class128.field2271 = var4;
            return;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ltj;)V")
    public class113(class157 arg0) {
        this.field1977 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIZ)I")
    public static final int method677(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1982 = -113;
        }
        int var3 = arg1 - 1 & arg0 >> 31;
        field1978++;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[Llc;[SI)V")
    public static final void method678(int arg0, int arg1, class143[] arg2, short[] arg3, int arg4) {
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            class143 var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].method870(102, var7) < (var9 & 0x1)) {
                    class143 var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method678(var6 - 1, arg1, arg2, arg3, arg4);
            method678(arg0, var6 + 1, arg2, arg3, 2);
        }
        if (arg4 == 2) {
            field1981++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
    public static void method679(byte arg0) {
        if (arg0 > -53) {
            field1982 = 13;
        }
        field1983 = null;
        field1979 = null;
    }
}
