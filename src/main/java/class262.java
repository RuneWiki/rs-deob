import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class262 {

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Ljn;")
    private class117 field3780 = new class117(64);

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lvo;")
    private class345 field3778;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public int field3779;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field3777 = new Random();

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "[S")
    public static short[] field3781 = new short[256];

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lja;", line = 8)
    public final class595 method1670(int arg0, int arg1) {
        field3776++;
        class117 var3 = this.field3780;
        class595 var4;
        synchronized (this.field3780) {
            var4 = (class595) this.field3780.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field3778;
        byte[] var6;
        synchronized (this.field3778) {
            var6 = this.field3778.method2081(-124, arg1, 19);
        }
        class595 var7 = new class595();
        if (var6 != null) {
            var7.method3407(-111, new class465(var6));
        }
        class117 var8 = this.field3780;
        synchronized (this.field3780) {
            this.field3780.method949((long) arg1, true, var7);
            int var9 = 92 / ((-arg0 - 15) / 44);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 41)
    public static final void method1671(int arg0) {
        int var1 = 15 % ((arg0 - 75) / 37);
        field3782++;
        class355 var2 = null;
        try {
            class614 var3 = class653.field9220.method3949("3", 0, false);
            while (var3.field8787 == 0) {
                class564.method3300((byte) -72, 1L);
            }
            if (var3.field8787 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var2 = (class355) var3.field8785;
            byte[] var4 = new byte[(int) var2.method2144(-60)];
            if (var4.length == 0) {
                class308.field4283 = "";
                class415.field5895 = "";
            } else {
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2146(var4.length - var5, -1, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class465 var7 = new class465(var4);
                int var8 = var7.method2705(-74);
                if (var8 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var7.field6710 = var8 + 1;
                if (!var7.method2716(-631)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var7.field6710 = 1;
                int var9 = var7.method2705(-84);
                if (var9 > 3) {
                    throw new RuntimeException("Invalid version " + var9);
                }
                class308.field4283 = var7.method2730((byte) 49);
                class415.field5895 = var7.method2730((byte) 33);
                if (var9 >= 1) {
                    class383.field5614 = var7.method2755((byte) -111);
                } else {
                    class383.field5614 = class557.field8151;
                }
                if (var9 >= 2) {
                    class219.field3286 = var7.method2727(0);
                } else {
                    class219.field3286 = class461.field6627;
                }
                if (var9 < 3) {
                    class435.field6262 = class529.field7808;
                } else if (var7.method2705(-46) == 1) {
                    class435.field6262 = var7.method2730((byte) 68);
                } else {
                    class435.field6262 = null;
                }
            }
        } catch (Exception var11) {
            class308.field4283 = "";
            class415.field5895 = "";
        }
        try {
            if (var2 != null) {
                var2.method2152(false);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 139)
    public static void method1672(int arg0) {
        if (arg0 != 980) {
            method1671(110);
        }
        field3777 = null;
        field3781 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIBI)V", line = 151)
    public static final void method1673(int arg0, int arg1, byte arg2, int arg3) {
        field3775++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class490.method2863(false, true, (byte) 93, var4);
        if (arg2 >= -85) {
            method1672(8);
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 179)
    public class262(class529 arg0, int arg1, class345 arg2) {
        this.field3778 = arg2;
        this.field3779 = this.field3778.method2098(0, 19);
    }
}
