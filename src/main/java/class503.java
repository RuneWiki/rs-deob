import jagex3.jagmisc.jagmisc;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class503 extends class488 implements class541 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    private int field7418;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field7427;

    static {
        new class446("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)J", line = 4)
    public final long method474(int arg0) {
        ++field7419;
        if (arg0 < 9) {
            this.method468((byte) -126);
        }
        return super.field7222.method2723();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[B)V", line = 16)
    public final void method475(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method2920(arg3, arg2);
        ++field7420;
        if (arg1 != -29444) {
            this.field7418 = 7;
        }
        this.field7418 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)Z", line = 28)
    public static final boolean method3014(int arg0, byte arg1, int arg2) {
        int var3 = 112 % ((arg1 - 16) / 36);
        ++field7421;
        return (384 & arg2) != 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I", line = 39)
    public final int method471(int arg0) {
        if (arg0 != 26493) {
            field7427 = 17;
        }
        ++field7422;
        return 0;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lnq;I[BI)V", line = 52)
    public class503(class325 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7418 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)V", line = 69)
    public static final void method3015(int arg0, boolean arg1, int arg2) {
        ++field7425;
        if (arg2 != 0) {
            if (arg1) {
                class400.field6090 = class165.method1130(class312.field4572, 0, (byte) 96, class85.field1245, class56.field816, 0);
                class400.field6090.method834(0);
                class82 var3 = class7.method92(class381.field5811, 0, arg0 + -15471, class84.field1221);
                class268 var4 = class400.field6090.method839(var3, class252.method1638(class266.field3709, class84.field1221, 0), true);
                class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556), true, var4, 2);
                class400.field6090.method757();
                class164.method1105(255);
                class400.field6090.method1120((byte) -128);
            }
            try {
                class400.field6090 = class165.method1130(class312.field4572, class203.field2716.field1150 * 2, (byte) 51, class85.field1245, class56.field816, arg2);
                if (class400.field6090.method836()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class198 var6;
                    if (var5) {
                        var6 = class400.field6090.method749(146800640);
                    } else {
                        var6 = class400.field6090.method749(104857600);
                    }
                    class400.field6090.method800(var6);
                }
            } catch (Throwable var8) {
                class400.field6090 = class165.method1130(class312.field4572, 0, (byte) 56, class85.field1245, class56.field816, 0);
                arg2 = 0;
            }
        } else {
            class400.field6090 = class165.method1130(class312.field4572, class203.field2716.field1150 * 2, (byte) 91, class85.field1245, class56.field816, arg2);
        }
        class378.field5771 = arg2;
        class263.method1698((byte) -121);
        if (!class400.field6090.method838()) {
            class315.field4586 = 1;
        }
        class400.field6090.method780(class315.field4586);
        class400.field6090.method740(arg0);
        class400.field6090.method769(8);
        class24.field346 = class400.field6090.method795();
        class346.field5342 = class400.field6090.method795();
        class66.method472(50);
        class400.field6090.method801(!class203.field2716.field1164);
        if (class400.field6090.method827()) {
            class45.method352(arg0 ^ -98, class203.field2716.field1149);
        }
        class421.method2574(true, class398.field6071 >> 3, class400.field6090, class528.field7734 >> 3);
        class173.method1171((byte) -32);
        class502.field7416 = false;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I", line = 147)
    public final int method468(byte arg0) {
        ++field7424;
        if (arg0 != -41) {
            field7423 = 27;
        }
        return this.field7418;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V", line = 159)
    public static final void method3016(int arg0, int arg1) {
        ++field7426;
        if (arg0 != 29338) {
            field7423 = 10;
        }
        class177 var2 = class344.method2229(6, arg1, (byte) 119);
        var2.method1194(arg0 ^ -29394);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lnq;ILjaggl/memory/NativeBuffer;)V", line = 174)
    public class503(class325 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field7418 = arg1;
    }
}
