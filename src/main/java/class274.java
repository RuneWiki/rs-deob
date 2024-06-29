import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class274 extends class6 implements class118 {

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    private int field4164;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Ls;")
    public static class186 field4162 = new class186(72, 8);

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "[S")
    public static short[] field4165;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "([BIII)V", line = 4)
    public final void method951(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 16700) {
            method1740((byte) 46);
        }
        this.method42(arg0, arg2);
        ++field4166;
        this.field4164 = arg3;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I", line = 16)
    public final int method953(int arg0) {
        ++field4168;
        return arg0 != -28043 ? -32 : 0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BZ)V", line = 29)
    public static final void method1738(byte arg0, boolean arg1) {
        ++field4161;
        if (arg1 && class319.field4850 != null) {
            class255.field3909 = class319.field4850.field3086;
        } else {
            class255.field3909 = -1;
        }
        class454.field6754 = null;
        class35.field537 = 0;
        class67.field1371 = null;
        class319.field4850 = null;
        class319.method2051();
        class319.field4858.method1891(-3);
        class100.field1928 = null;
        class533.field7742 = null;
        class79.field1578 = -1;
        class512.field7446 = null;
        class322.field4926 = -1;
        class456.field6773 = null;
        class319.field4854 = null;
        class416.field6277 = null;
        class520.field7561 = null;
        class383.field5603 = null;
        class326.field4943 = null;
        class136.field2292 = null;
        class319.field4842.method1248(true);
        class319.field4848.method2132(64, 64, true);
        class319.field4842.method1249(64, -109, 128);
        class319.field4846.method1522(64, (byte) 111);
        class155.field2526.method1453(1073741824, 64);
        if (arg0 != 39) {
            method1738((byte) -46, true);
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lda;I[BI)V", line = 74)
    public class274(class44 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4164 = arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;IIJIZILjava/lang/String;ZII)V", line = 82)
    public static final void method1739(String arg0, int arg1, int arg2, long arg3, int arg4, boolean arg5, int arg6, String arg7, boolean arg8, int arg9, int arg10) {
        ++field4160;
        if (arg1 >= 3) {
            if (!class76.field1543 && class332.field5041 < 500) {
                int var12 = ~arg6 == 0 ? class271.field4116 : arg6;
                class328 var13 = new class328(arg0, arg7, var12, arg2, arg9, arg3, arg4, arg10, arg8, arg5);
                class373.field5469.method1885(false, var13);
                ++class332.field5041;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I", line = 102)
    public final int method952(int arg0) {
        if (arg0 != 22081) {
            method1740((byte) 62);
        }
        ++field4167;
        return this.field4164;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)J", line = 113)
    public final long method950(int arg0) {
        ++field4159;
        if (arg0 != 29002) {
            method1740((byte) 7);
        }
        return super.field99.method2641();
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lda;ILjaggl/memory/NativeBuffer;)V", line = 124)
    public class274(class44 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field4164 = arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 136)
    public static void method1740(byte arg0) {
        field4165 = null;
        if (arg0 != 45) {
            field4158 = -1;
        }
        field4162 = null;
    }
}
