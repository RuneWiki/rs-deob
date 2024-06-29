import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class307 {

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lph;")
    public static class229 field5183 = class266.method1858(",Mcran)2titre ouvert", 0);

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[I")
    public static int[] field5184 = new int[32];

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "[I")
    public static int[] field5187 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lph;")
    public static class229 field5188 = class266.method1858("Gestionnaire de saisie charg-B", 0);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lgl;")
    public class307 field5176;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lgl;")
    public class307 field5179;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lkb;")
    public static class89 field5177;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[Lka;")
    public static class293[] field5182;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)[Lpe;", line = 10)
    public static final class77[] method2072(int arg0) {
        field5186++;
        if (class221.field3626 == null) {
            class77[] var1 = class294.method1998(class249.field4143, true);
            class77[] var2 = new class77[var1.length];
            int var3 = 0;
            label60: for (int var4 = 0; var4 < var1.length; var4++) {
                class77 var5 = var1[var4];
                if ((var5.field1284 <= 0 || var5.field1284 >= 24) && var5.field1290 >= 800 && var5.field1291 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class77 var7 = var2[var6];
                        if (var5.field1290 == var7.field1290 && var5.field1291 == var7.field1291) {
                            if (var5.field1284 > var7.field1284) {
                                var2[var6] = var5;
                            }
                            continue label60;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class221.field3626 = new class77[var3];
            class42.method313(var2, 0, class221.field3626, 0, var3);
            int[] var8 = new int[class221.field3626.length];
            for (int var9 = 0; var9 < class221.field3626.length; var9++) {
                class77 var10 = class221.field3626[var9];
                var8[var9] = var10.field1291 * var10.field1290;
            }
            class315.method2137((byte) 108, class221.field3626, var8);
        }
        return arg0 >= -107 ? (class77[]) null : class221.field3626;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 96)
    public static void method2073(int arg0) {
        field5183 = null;
        field5184 = null;
        field5188 = null;
        field5182 = null;
        if (arg0 < -119) {
            field5177 = null;
            field5187 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILgi;IIIII)V", line = 114)
    public static final void method2074(int arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5181++;
        if (arg2 == 600) {
            class298.method2008(arg1.field5147, arg6, arg3, arg0, arg5, arg4, arg1.field5168, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 137)
    public final void method2075(int arg0) {
        if (arg0 != 6204) {
            method2072(-72);
        }
        field5178++;
        if (this.field5179 != null) {
            this.field5179.field5176 = this.field5176;
            this.field5176.field5179 = this.field5179;
            this.field5179 = null;
            this.field5176 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lsi;BII)[Lrl;", line = 171)
    public static final class327[] method2076(class66 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -64) {
            field5182 = (class293[]) null;
        }
        field5185++;
        return class176.method1264(arg3, (byte) 126, arg0, arg2) ? class301.method2028(arg1 - 23) : null;
    }
}
