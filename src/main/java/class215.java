import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class215 extends class429 {

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "Lsv;")
    public static class570 field3134 = new class570(24, 7);

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "Z")
    public static boolean field3142 = false;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "Lmq;")
    public static class85 field3139;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
    public static void method1479(byte arg0) {
        field3134 = null;
        if (arg0 == -113) {
            field3139 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
    public final void method47(byte arg0) {
        ++field3138;
        int var2 = 36 % ((arg0 - -56) / 48);
        super.field5939.method986(117, false);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZZ)V")
    public final void method44(boolean arg0, boolean arg1) {
        ++field3140;
        if (!arg1) {
            super.field5939.method986(124, true);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 == 37) {
            ++field3132;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z")
    public final boolean method48(byte arg0) {
        ++field3141;
        if (arg0 != -128) {
            field3139 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
    public final void method43(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field3134 = null;
        }
        ++field3136;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
    public static final void method1480(byte arg0) {
        if (arg0 > -38) {
            method1480((byte) -109);
        }
        ++field3137;
        if (class108.method866((byte) -66)) {
            if (class334.field4738 == null) {
                class58.method618(true);
            }
            class518.field7119 = 0;
            class499.field6863 = true;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lmj;)V")
    public class215(class114 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "(B)V")
    public static final void method1481(byte arg0) {
        for (class400 var1 = (class400) class209.field3056.method1735(-17801); var1 != null; var1 = (class400) class209.field3056.method1735(-17801)) {
            class535.method3107((byte) -100, var1);
        }
        ++field3133;
        int var2;
        int var3;
        if (class420.field5820.field9495.method1677(17539) != 1) {
            var2 = class112.field1620;
            var3 = class112.field1620;
        } else {
            var3 = 0;
            var2 = 3;
        }
        client.method899();
        if (arg0 <= 92) {
            field3134 = null;
        }
        for (int var4 = var3; ~var2 <= ~var4; ++var4) {
            client.method902();
            client.method892(var4);
            client.method879(var4);
        }
        client.method887();
        client.method881();
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Len;ZI)V")
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        ++field3135;
        if (arg1) {
            field3142 = true;
        }
        super.field5939.method988(1, arg0);
        super.field5939.method949(arg2, (byte) 57);
    }
}
