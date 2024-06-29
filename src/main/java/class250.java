import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class250 extends class218 implements class121 {

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    private int field4084;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field4077 = 104;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Lpu;")
    public static class179 field4074 = new class179("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "[I")
    public static int[] field4083 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "J")
    public static long field4082 = 0L;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "[F")
    public static float[] field4081 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "Lpc;")
    public static class26 field4080;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)J", line = 3)
    public final long method904(int arg0) {
        if (arg0 != 26405) {
            method1790((byte) -88);
        }
        ++field4076;
        return 0L;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)I", line = 18)
    public final int method906(boolean arg0) {
        ++field4078;
        if (arg0) {
            this.method906(false);
        }
        return super.field3290;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V", line = 29)
    public static void method1788(int arg0) {
        field4083 = null;
        if (arg0 != -1623) {
            field4082 = 114L;
        }
        field4080 = null;
        field4074 = null;
        field4081 = null;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ltt;I[BIZ)V", line = 42)
    public class250(class249 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4084 = arg1;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V", line = 51)
    public final void method1503(int arg0) {
        if (arg0 != 323998446) {
            field4081 = null;
        }
        ++field4072;
        super.field3289.method1785((byte) -111, this);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lza;)V", line = 64)
    public static final void method1789(class299 arg0) {
        for (int var1 = class251.field4091; var1 < class183.field2802; ++var1) {
            for (int var2 = 0; var2 < class474.field6947; ++var2) {
                for (int var3 = 0; var3 < class443.field6603; ++var3) {
                    class281 var4 = class348.field5192[var1][var2][var3];
                    if (var4 != null) {
                        class501 var5 = var4.field4380;
                        class501 var6 = var4.field4390;
                        if (var5 != null && var5.method107((byte) -88)) {
                            class311.method2066(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method107((byte) -88)) {
                                class311.method2066(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method102(arg0, 0, 0, -750, var5, 0, false);
                                var6.method108(-2);
                            }
                            var5.method108(105);
                        }
                        for (class21 var7 = var4.field4381; var7 != null; var7 = var7.field235) {
                            class76 var9 = var7.field240;
                            if (var9 != null && var9.method107((byte) -88)) {
                                class311.method2066(arg0, var9, var1, var2, var3, var9.field1271 - var9.field1283 + 1, var9.field1272 - var9.field1277 + 1);
                                var9.method108(93);
                            }
                        }
                        class481 var8 = var4.field4371;
                        if (var8 != null && var8.method107((byte) -88)) {
                            class276.method1884(arg0, var8, var1, var2, var3);
                            var8.method108(113);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V", line = 141)
    public static final void method1790(byte arg0) {
        class110.method857(4095, class280.field4363);
        if (arg0 > -102) {
            field4077 = 92;
        }
        ++class243.field3664;
        ++field4079;
        class312.field4752.method1381(0, (byte) 85);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III[B)V", line = 154)
    public final void method903(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field4073;
        if (arg2 != 11907) {
            field4080 = null;
        }
        this.method1504(arg3, 35044, arg0);
        this.field4084 = arg1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)I", line = 173)
    public final int method905(byte arg0) {
        ++field4075;
        if (arg0 != -124) {
            this.field4084 = 97;
        }
        return this.field4084;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ltt;ILjaggl/memory/NativeBuffer;IZ)V", line = 191)
    public class250(class249 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4084 = arg1;
    }
}
