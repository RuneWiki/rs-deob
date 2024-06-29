import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class26 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lrm;")
    public static class184 field385 = new class184(30);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field391 = 1;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Z")
    public static boolean field392 = false;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lea;")
    public static class246 field388;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZI)V", line = 9)
    public static final void method245(int arg0, int arg1, boolean arg2, int arg3) {
        class326.method2291(arg2, 105);
        field384++;
        class81.field1108 = arg3;
        class282.field4352 = arg0;
        class131.method970(arg1, !arg2);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lmk;", line = 23)
    public static final class25 method246(int arg0, int arg1, int arg2, int arg3) {
        field390++;
        class25 var4 = new class25();
        var4.field375 = arg2;
        var4.field376 = arg1;
        class210.field3304.method2161(var4, (long) arg0, -1);
        class199.method1466(arg1, (byte) -98);
        if (arg3 != 22) {
            field385 = (class184) null;
        }
        class136 var5 = class14.method140(arg0, 1036508464);
        if (var5 != null) {
            class167.method1250(var5, 412);
        }
        if (class237.field3723 != null) {
            class167.method1250(class237.field3723, 412);
            class237.field3723 = null;
        }
        int var6 = class78.field1046;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class286.method2023(-82, class282.field4365[var7])) {
                class249.method1792(var7, -1);
            }
        }
        if (class78.field1046 == 1) {
            class238.field3729 = false;
            class319.method2240(class138.field2197, class295.field4575, true, class95.field1264, class281.field4343);
        } else {
            class319.method2240(class138.field2197, class295.field4575, true, class95.field1264, class281.field4343);
            int var8 = class270.field4197.method2254(class232.field3623);
            for (int var9 = 0; var9 < class78.field1046; var9++) {
                int var10 = class270.field4197.method2254(class207.method1525(8, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class95.field1264 = class78.field1046 * 15 + (class334.field5196 ? 26 : 22);
            class138.field2197 = var8 + 8;
        }
        if (var5 != null) {
            class82.method602((byte) 65, var5, false);
        }
        class107.method731(arg1, 0);
        if (class147.field2321 != -1) {
            class72.method555(1, -22, class147.field2321);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 103)
    public static final void method247(int arg0) {
        field389++;
        for (int var1 = 0; var1 < class277.field4285; var1++) {
            int var2 = class36.field526[var1];
            class337 var3 = class284.field4403[var2];
            int var4 = class111.field1544.method58(arg0 - 288140072);
            if ((var4 & 0x40) != 0) {
                var4 += class111.field1544.method58(-288140008) << 8;
            }
            class278.method1953(var2, 104, var3, var4);
        }
        if (arg0 != 64) {
            method249((byte) -56, (class253) null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 136)
    public static void method248(int arg0) {
        field385 = null;
        field388 = null;
        if (arg0 != 8) {
            field392 = false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLug;)V", line = 148)
    public static final void method249(byte arg0, class253 arg1) {
        field387++;
        class124.field1770 = arg1;
        class94.field1251 = class124.field1770.method1826(0, 16);
        if (arg0 != 103) {
            field392 = false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public abstract void method243(byte arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public abstract int method244(int arg0, int arg1, int arg2);
}
