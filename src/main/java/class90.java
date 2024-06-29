import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class90 {

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ldc;")
    private class5 field1234 = new class5(64);

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Ldc;")
    public class5 field1241 = new class5(50);

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Ldc;")
    public class5 field1242 = new class5(5);

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "Z")
    public boolean field1240;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lhe;")
    public class239 field1239;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lhe;")
    private class239 field1230;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1225 = new String[100];

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lwt;")
    public static class194 field1224 = new class194("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lt;")
    public static class454 field1238;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[[I")
    public static int[][] field1237;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lts;I)V", line = 7)
    public static final void method558(class356 arg0, int arg1) {
        field1235++;
        if (arg1 != 2047) {
            method566(18);
        }
        if (class347.field5015 != arg0.field5192) {
            return;
        }
        if (class415.field6145.field4592 == null) {
            arg0.field5218 = 0;
            arg0.field5191 = 0;
            return;
        }
        arg0.field5139 = 150;
        arg0.field5225 = (int) (Math.sin((double) class263.field3748 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field5191 = class156.field2047;
        arg0.field5141 = 5;
        arg0.field5218 = class17.method123((byte) -54, class415.field6145.field4592);
        arg0.field5217 = class415.field6145.field4232;
        arg0.field5212 = class415.field6145.field4256;
        arg0.field5221 = class415.field6145.field4253;
        arg0.field5224 = 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 38)
    public final void method559(int arg0, int arg1) {
        field1229++;
        this.field1243 = arg1;
        class5 var3 = this.field1241;
        synchronized (this.field1241) {
            this.field1241.method38((byte) -31);
        }
        class5 var4 = this.field1242;
        synchronized (this.field1242) {
            this.field1242.method38((byte) -44);
            int var5 = -96 % ((arg0 - 17) / 48);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILmd;I)V", line = 54)
    public static final void method560(int arg0, class364 arg1, int arg2) {
        class13.field200 = false;
        field1227++;
        class84.field1160 = 0;
        class128.method712(2078729827, arg1);
        class412.method2453(arg1, 197482768);
        if (class13.field200) {
            System.out.println("---endgpp---");
        }
        if (arg2 == 256 && arg1.field2018 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field2018 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 75)
    public final void method561(int arg0) {
        class5 var2 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method35((byte) -1);
            if (arg0 != 10675) {
                this.field1243 = 25;
            }
        }
        field1232++;
        class5 var3 = this.field1241;
        synchronized (this.field1241) {
            this.field1241.method35((byte) -1);
        }
        class5 var4 = this.field1242;
        synchronized (this.field1242) {
            this.field1242.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 96)
    public final void method562(byte arg0) {
        class5 var2 = this.field1241;
        synchronized (this.field1241) {
            int var3 = -122 % ((-arg0 - 18) / 43);
            this.field1241.method38((byte) -46);
        }
        field1226++;
        class5 var4 = this.field1242;
        synchronized (this.field1242) {
            this.field1242.method38((byte) -2);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 111)
    public final void method563(int arg0) {
        field1231++;
        class5 var2 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method38((byte) -102);
        }
        class5 var3 = this.field1241;
        synchronized (this.field1241) {
            if (arg0 != 0) {
                return;
            }
            this.field1241.method38((byte) -88);
        }
        class5 var4 = this.field1242;
        synchronized (this.field1242) {
            this.field1242.method38((byte) -70);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V", line = 131)
    public final void method564(boolean arg0, int arg1) {
        field1223++;
        if (arg0 == this.field1240) {
            return;
        }
        this.field1240 = arg0;
        if (arg1 != 150) {
            this.method567(113, -22);
        }
        this.method563(0);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Ldg;", line = 152)
    public final class272 method565(int arg0, int arg1) {
        field1228++;
        class5 var3 = this.field1234;
        class272 var4;
        synchronized (this.field1234) {
            var4 = (class272) this.field1234.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1230.method1470(4, class384.method2312(arg1, (byte) -127), class274.method1680(738415111, arg1));
        class272 var6 = new class272();
        var6.field3853 = this;
        if (arg0 != 27114) {
            method558(null, 96);
        }
        var6.field3850 = arg1;
        if (var5 != null) {
            var6.method1657(true, new class156(var5));
        }
        var6.method1665(2);
        class5 var7 = this.field1234;
        synchronized (this.field1234) {
            this.field1234.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 192)
    public static void method566(int arg0) {
        if (arg0 != 18396) {
            field1225 = null;
        }
        field1237 = null;
        field1238 = null;
        field1225 = null;
        field1224 = null;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(II)V", line = 206)
    public final void method567(int arg0, int arg1) {
        field1236++;
        class5 var3 = this.field1234;
        synchronized (this.field1234) {
            if (arg0 != -18033) {
                return;
            }
            this.field1234.method39(false, arg1);
        }
        class5 var4 = this.field1241;
        synchronized (this.field1241) {
            this.field1241.method39(false, arg1);
        }
        class5 var5 = this.field1242;
        synchronized (this.field1242) {
            this.field1242.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I", line = 231)
    public static final int method568(int arg0, byte arg1) {
        if (arg1 < 95) {
            method568(-58, (byte) 63);
        }
        field1233++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lci;IZLhe;Lhe;)V", line = 276)
    public class90(class298 arg0, int arg1, boolean arg2, class239 arg3, class239 arg4) {
        this.field1240 = arg2;
        this.field1239 = arg4;
        this.field1230 = arg3;
        if (this.field1230 != null) {
            int var6 = this.field1230.method1466(false) - 1;
            this.field1230.method1473(4309, var6);
        }
    }
}
