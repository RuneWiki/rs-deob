import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class87 {

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Ltia;")
    private class281 field1216 = new class281();

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "Ldha;")
    private class84 field1220 = new class84();

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "Lee;")
    private class706 field1229;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "[I")
    public static int[] field1214 = new int[1];

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "Lmga;")
    public static class739 field1215 = new class739(34, 6);

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "Ljda;")
    public static class239 field1226 = new class239(4);

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "Ljda;")
    public static class239 field1228 = new class239(5);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static void method712(int arg0) {
        field1215 = null;
        if (arg0 == 27946) {
            field1228 = null;
            field1226 = null;
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)Ltia;")
    public final class281 method713(long arg0, int arg1) {
        field1223++;
        class281 var4 = (class281) this.field1229.method3953(arg0, 14);
        if (arg1 < 0) {
            field1214 = null;
        }
        if (var4 != null) {
            this.field1220.method695(-93, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Loba;B)V")
    public static final void method714(class275 arg0, byte arg1) {
        field1225++;
        if (class526.field7216) {
            return;
        }
        arg0.method792((byte) -118);
        int var2 = -110 / ((arg1 + 77) / 49);
        class746.field10297--;
        if (!arg0.field4073) {
            long var3 = arg0.field4087;
            class81 var5;
            for (var5 = (class81) class643.field8925.method3953(var3, 14); var5 != null && !var5.field1150.equals(arg0.field4084); var5 = (class81) class643.field8925.method3958(-15797)) {
            }
            if (var5 != null && var5.method684(53, arg0)) {
                class92.method736(var5, (byte) 3);
                return;
            }
            return;
        }
        for (class81 var6 = (class81) class57.field805.method697(0); var6 != null; var6 = (class81) class57.field805.method699(true)) {
            if (var6.field1150.equals(arg0.field4084)) {
                boolean var7 = false;
                for (class275 var8 = (class275) var6.field1155.method697(0); var8 != null; var8 = (class275) var6.field1155.method699(true)) {
                    if (arg0 == var8) {
                        var7 = true;
                        if (var6.method684(-85, arg0)) {
                            class92.method736(var6, (byte) 3);
                        }
                        break;
                    }
                }
                if (var7) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIII)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 2760) {
            field1213++;
            if (class712.field9959.field1275.method3352(7) != 0 && arg3 != 0 && class393.field5800 < 50 && arg1 != -1) {
                class729.field10120[class393.field5800++] = new class720((byte) 1, arg1, arg3, arg2, arg0, 0, arg4, null);
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(JI)V")
    public final void method716(long arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field1222++;
        class281 var4 = (class281) this.field1229.method3953(arg0, 14);
        if (var4 != null) {
            var4.method792((byte) -126);
            var4.method1811(arg1 ^ 0x6DA0);
            this.field1224++;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ltia;IJ)V")
    public final void method717(class281 arg0, int arg1, long arg2) {
        if (this.field1224 == 0) {
            class281 var5 = this.field1220.method698(47);
            var5.method792((byte) -96);
            var5.method1811(28064);
            if (this.field1216 == var5) {
                class281 var6 = this.field1220.method698(-109);
                var6.method792((byte) -111);
                var6.method1811(28064);
            }
        } else {
            this.field1224--;
        }
        field1218++;
        if (arg1 >= 96) {
            this.field1229.method3962(arg2, arg0, -115);
            this.field1220.method695(-118, arg0);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public final void method718(byte arg0) {
        if (arg0 < 118) {
            this.field1216 = null;
        }
        field1217++;
        this.field1220.method700(122);
        this.field1229.method3959(0);
        this.field1216 = new class281();
        this.field1224 = this.field1227;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
    public class87(int arg0) {
        this.field1227 = arg0;
        this.field1224 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1229 = new class706(var2);
    }
}
