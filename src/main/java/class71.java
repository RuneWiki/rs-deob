import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class71 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field1199 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[J")
    public static long[] field1203 = new long[200];

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "[I")
    public static int[] field1204 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Loa;")
    public static class99 field1205 = class221.method1463(2844, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Ltg;")
    public static class182 field1200;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method497(int arg0) {
        int var1 = arg0;
        field1206++;
        int[] var2 = new int[class244.field4207];
        for (int var3 = 0; var3 < class244.field4207; var3++) {
            class166 var5 = class222.method1468(1, var3);
            if (var5.field2950 >= 0 || var5.field2962 >= 0) {
                var2[var1++] = var3;
            }
        }
        class167.field2979 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            class167.field2979[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILik;B)V")
    private final void method498(int arg0, class261 arg1, byte arg2) {
        if (arg0 == 5) {
            this.field1199 = arg1.method1740((byte) 112);
        }
        field1198++;
        if (arg2 != -126) {
            method500(30, true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lik;B)V")
    public final void method499(class261 arg0, byte arg1) {
        if (arg1 != 99) {
            this.method499((class261) null, (byte) -104);
        }
        while (true) {
            int var3 = arg0.method1693((byte) 39);
            if (var3 == 0) {
                field1207++;
                return;
            }
            this.method498(var3, arg0, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)Z")
    public static final boolean method500(int arg0, boolean arg1) {
        field1201++;
        if (arg1) {
            return true;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        if (arg0) {
            field1204 = null;
        }
        field1205 = null;
        field1204 = null;
        field1200 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static int method502(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
