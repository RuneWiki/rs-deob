import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class324 extends class392 {

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lcia;")
    public class614 field4341;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Lega;")
    public class711 field4343;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Lea;")
    public static class547 field4345 = new class547(60, 4);

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "[I")
    public static int[] field4354 = new int[3];

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
    public static final String method1933(int arg0, int arg1, byte arg2, byte[] arg3) {
        field4351++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg2 >= -49) {
            method1935(-78, 47, 80, 103, (byte) -48, -72, 123);
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class488.field6684[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public final void method1934(int arg0) {
        this.field4344 = this.field4341.field8601;
        this.field4352 = this.field4341.field8612;
        field4349++;
        int var2 = 87 % ((arg0 + 1) / 44);
        this.field4342 = this.field4341.field8604;
        if (this.field4341.field8608 != null) {
            this.field4341.field8608.method32(this.field4343.field9922, this.field4343.field9928, this.field4343.field9921, class717.field10051);
        }
        this.field4350 = class717.field10051[2];
        this.field4346 = class717.field10051[0];
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1935(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != -78) {
            field4354 = null;
        }
        class190.field2286 = arg6;
        class249.field3230 = arg3;
        class702.field9860 = arg0;
        field4347++;
        class13.field94 = arg2;
        class291.field3850 = arg5;
        class101.field1361 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1936(byte arg0) {
        field4354 = null;
        if (arg0 == -112) {
            field4345 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILha;)Lmv;")
    public static final class377 method1937(int arg0, int arg1, class60 arg2) {
        if (arg1 != 18361) {
            method1937(59, 118, null);
        }
        field4348++;
        class535 var3 = class175.method1005(arg0, true, arg2, true);
        return var3 == null ? null : var3.field7253;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lcia;Llba;)V")
    public class324(class614 arg0, class550 arg1) {
        this.field4341 = arg0;
        this.field4343 = this.field4341.method3454((byte) 93);
        this.method1934(-102);
    }
}
