import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class238 extends class153 {

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field4160 = 0;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field4157 = 0;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "Z")
    public static boolean field4159 = true;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "Lpj;")
    public static class237 field4169 = class33.method353(" ", 92);

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4170 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lak;")
    public static class135 field4168 = new class135(30);

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Lpj;")
    public class237 field4164;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "[I")
    public static int[] field4165;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILie;)V")
    public final void method1625(int arg0, class32 arg1) {
        if (arg0 != 0) {
            field4160 = -50;
        }
        field4161++;
        while (true) {
            int var3 = arg1.method316((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method1628(arg1, (byte) 78, var3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lpj;I)Lpj;")
    public static final class237 method1626(class237[] arg0, int arg1) {
        field4162++;
        if (arg1 >= -5) {
            return null;
        } else if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class47.method437(0, arg0.length, false, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field4169 = null;
        field4168 = null;
        field4165 = null;
        if (arg0 != 2) {
            method1627(-59);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lie;BI)V")
    private final void method1628(class32 arg0, byte arg1, int arg2) {
        field4166++;
        if (arg2 == 1) {
            this.field4163 = arg0.method316((byte) 112);
        } else if (arg2 == 2) {
            this.field4158 = arg0.method319((byte) -18);
        } else if (arg2 == 5) {
            this.field4164 = arg0.method324(1);
        }
        if (arg1 != 78) {
            field4170 = 119;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Z")
    public final boolean method1629(boolean arg0) {
        if (arg0) {
            this.method1628((class32) null, (byte) -4, 9);
        }
        field4167++;
        return this.field4163 == 115;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public static final void method1630(int arg0) {
        field4156++;
        if (arg0 != 1) {
            return;
        }
        for (class61 var1 = (class61) class27.field487.method673(false); var1 != null; var1 = (class61) class27.field487.method680(126)) {
            if (var1.field1231 > 0) {
                var1.field1231--;
            }
            if (var1.field1231 != 0) {
                if (var1.field1218 > 0) {
                    var1.field1218--;
                }
                if (var1.field1218 == 0 && var1.field1228 >= 1 && var1.field1226 >= 1 && var1.field1228 <= 102 && var1.field1226 <= 102 && (var1.field1232 < 0 || class96.method715(var1.field1220, true, var1.field1232))) {
                    class184.method1259(var1.field1216, var1.field1217, var1.field1226, -23853, var1.field1220, var1.field1232, var1.field1236, var1.field1228);
                    var1.field1218 = -1;
                    if (var1.field1232 == var1.field1227 && var1.field1227 == -1) {
                        var1.method629(0);
                    } else if (var1.field1232 == var1.field1227 && var1.field1236 == var1.field1233 && var1.field1237 == var1.field1220) {
                        var1.method629(0);
                    }
                }
            } else if (var1.field1227 < 0 || class96.method715(var1.field1237, true, var1.field1227)) {
                class184.method1259(var1.field1216, var1.field1217, var1.field1226, -23853, var1.field1237, var1.field1227, var1.field1233, var1.field1228);
                var1.method629(0);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)V")
    public static final void method1631(int arg0, int arg1, int arg2, int arg3) {
        class35 var4 = class274.field4775[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class212 var5 = var4.field749;
        if (var5 != null) {
            var5.field3615 = var5.field3615 * arg3 / 16;
            var5.field3619 = var5.field3619 * arg3 / 16;
        }
    }
}
