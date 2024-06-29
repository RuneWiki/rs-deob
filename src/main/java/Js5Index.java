import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public abstract class Js5Index {

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "Z")
    public boolean field321;

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "Z")
    private boolean field327;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Lv;")
    public static JagString field317 = class1.method2(255, "Loom");

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Lv;")
    public static JagString field320 = class1.method2(255, "Gem Shop");

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "Lv;")
    public static JagString field331 = class1.method2(255, "Jewellery");

    @OriginalMember(owner = "mapview!o", name = "u", descriptor = "[J")
    public static long[] field333 = new long[32];

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "Lv;")
    public static JagString field330 = class1.method2(255, "Cookery Shop");

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "Le;")
    private IntHashTable field325;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[B")
    public static byte[] field315;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "[I")
    private int[] field318;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "[I")
    private int[] field319;

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "[I")
    private int[] field324;

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "[I")
    public int[] field326;

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "[Le;")
    private IntHashTable[] field323;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "[Ljava/lang/Object;")
    public Object[] field322;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "[[I")
    private int[][] field313;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[[I")
    private int[][] field314;

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field332;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(BIILo;)Ls;", line = 31)
    public static final PixFont method124(byte arg0, int arg1, int arg2, Js5Index arg3) {
        if (arg0 <= 100) {
            return (PixFont) null;
        } else if (HashTable.method31(arg2, arg3, -1, arg1)) {
            return JavaKeyboard.method6(128);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B[B)V", line = 44)
    public final void method125(byte arg0, byte[] arg1) {
        this.field329 = DoublyLinkable.method19(arg0 ^ 0x1E, arg1.length, arg1);
        if (arg0 != 5) {
            this.field313 = null;
        }
        Packet var3 = new Packet(Timer.method195(arg0 ^ 0x1C36, arg1));
        int var4 = var3.g1(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        int var5 = -1;
        int var6 = 0;
        if (var4 >= 6) {
            var3.method155(arg0 + 65275);
        }
        int var7 = var3.g1(false);
        this.field328 = var3.g2((byte) 0);
        this.field326 = new int[this.field328];
        for (int var8 = 0; var8 < this.field328; var8++) {
            this.field326[var8] = var6 += var3.g2((byte) 0);
            if (var5 < this.field326[var8]) {
                var5 = this.field326[var8];
            }
        }
        this.field322 = new Object[var5 + 1];
        this.field332 = new Object[var5 + 1][];
        this.field318 = new int[var5 + 1];
        this.field324 = new int[var5 + 1];
        this.field314 = new int[var5 + 1][];
        this.field319 = new int[var5 + 1];
        if (var7 != 0) {
            this.field316 = new int[var5 + 1];
            for (int var9 = 0; var9 < this.field328; var9++) {
                this.field316[this.field326[var9]] = var3.method155(65280);
            }
            this.field325 = new IntHashTable(this.field316);
        }
        for (int var10 = 0; var10 < this.field328; var10++) {
            this.field318[this.field326[var10]] = var3.method155(Worldmap.method165(arg0, 65285));
        }
        for (int var11 = 0; var11 < this.field328; var11++) {
            this.field319[this.field326[var11]] = var3.method155(65280);
        }
        for (int var12 = 0; var12 < this.field328; var12++) {
            this.field324[this.field326[var12]] = var3.g2((byte) 0);
        }
        for (int var13 = 0; var13 < this.field328; var13++) {
            int var14 = this.field326[var13];
            int var15 = 0;
            int var16 = this.field324[var14];
            this.field314[var14] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field314[var14][var18] = var15 += var3.g2((byte) 0);
                if (var17 < var19) {
                    var17 = var19;
                }
            }
            this.field332[var14] = new Object[var17 + 1];
        }
        if (var7 == 0) {
            return;
        }
        this.field313 = new int[var5 + 1][];
        this.field323 = new IntHashTable[var5 + 1];
        for (int var20 = 0; var20 < this.field328; var20++) {
            int var21 = this.field326[var20];
            int var22 = this.field324[var21];
            this.field313[var21] = new int[this.field332[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field313[var21][this.field314[var21][var23]] = var3.method155(65280);
            }
            this.field323[var21] = new IntHashTable(this.field313[var21]);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(II[IB)[B", line = 191)
    private final byte[] method126(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg1 < 0 || arg1 >= this.field332.length || this.field332[arg1] == null || arg0 < 0 || this.field332[arg1].length <= arg0) {
            return null;
        }
        if (this.field332[arg1][arg0] == null) {
            boolean var5 = this.method127(-5976, arg2, arg1);
            if (!var5) {
                this.method129((byte) 32, arg1);
                boolean var6 = this.method127(-5976, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = JagException.method46(false, this.field332[arg1][arg0], (byte) -14);
        if (this.field327) {
            this.field332[arg1][arg0] = null;
        }
        return arg3 <= 36 ? (byte[]) null : var7;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I[II)Z", line = 226)
    private final boolean method127(int arg0, int[] arg1, int arg2) {
        if (this.field322[arg2] == null) {
            return false;
        }
        int var4 = this.field324[arg2];
        if (arg0 != -5976) {
            return false;
        }
        boolean var5 = true;
        int[] var6 = this.field314[arg2];
        Object[] var7 = this.field332[arg2];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var6[var8]] == null) {
                var5 = false;
                break;
            }
        }
        if (var5) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = JagException.method46(false, this.field322[arg2], (byte) -14);
        } else {
            var9 = JagException.method46(true, this.field322[arg2], (byte) -14);
            Packet var10 = new Packet(var9);
            var10.tinydec(5, var10.data.length, arg1, false);
        }
        byte[] var11;
        try {
            var11 = Timer.method195(7219, var9);
        } catch (RuntimeException var28) {
            throw BZip2State.method252(var28, "T3 - " + (arg1 != null) + "," + arg2 + "," + var9.length + "," + DoublyLinkable.method19(27, var9.length, var9) + "," + DoublyLinkable.method19(27, var9.length - 2, var9) + "," + this.field318[arg2] + "," + this.field329);
        }
        if (this.field321) {
            this.field322[arg2] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var4 * var14 * 4;
            Packet var16 = new Packet(var11);
            var16.pos = var15;
            int[] var17 = new int[var4];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method155(arg0 + 71256);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            var16.pos = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method155(65280);
                    ByteArrayCopier.copy(var11, var23, var21[var26], var17[var26], var25);
                    var17[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field327) {
                    var7[var6[var27]] = var21[var27];
                } else {
                    var7[var6[var27]] = StringNode.wrap(false, var21[var27], false);
                }
            }
        } else if (this.field327) {
            var7[var6[0]] = var11;
        } else {
            var7[var6[0]] = StringNode.wrap(false, var11, false);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(BLv;)I", line = 397)
    public final int method128(byte arg0, JagString arg1) {
        if (arg0 >= -56) {
            this.field319 = null;
        }
        JagString var3 = arg1.method236((byte) 92);
        return this.field325.get(var3.method246(false), -7553);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(BI)V", line = 415)
    private final void method129(byte arg0, int arg1) {
        if (arg0 <= 31) {
            this.method132(-52, -46, null);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lv;Lv;B)[B", line = 446)
    public final byte[] method130(JagString arg0, JagString arg1, byte arg2) {
        JagString var4 = arg1.method236((byte) 92);
        JagString var5 = arg0.method236((byte) 92);
        int var6 = this.field325.get(var4.method246(false), arg2 - 7425);
        int var7 = this.field323[var6].get(var5.method246(false), -7553);
        if (arg2 != -128) {
            this.field314 = null;
        }
        return this.method133(var7, -79, var6);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 470)
    public static void method131(int arg0) {
        field331 = null;
        field333 = null;
        field330 = null;
        field315 = null;
        field317 = null;
        if (arg0 == -1) {
            field320 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IILv;)I", line = 489)
    public final int method132(int arg0, int arg1, JagString arg2) {
        if (arg0 != -9751) {
            field320 = null;
        }
        JagString var4 = arg2.method236((byte) 92);
        return this.field323[arg1].get(var4.method246(false), -7553);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III)[B", line = 515)
    public final byte[] method133(int arg0, int arg1, int arg2) {
        if (arg1 > -39) {
            this.field329 = -120;
        }
        return this.method126(arg0, arg2, null, (byte) 117);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 526)
    public static final void method134(int arg0, Component arg1) {
        arg1.removeMouseListener(Worldmap.field347);
        if (arg0 != -7) {
            method134(-92, null);
        }
        arg1.removeMouseMotionListener(Worldmap.field347);
        arg1.removeFocusListener(Worldmap.field347);
        Worldmap.field363 = 0;
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "(ZZ)V", line = 543)
    public Js5Index(boolean arg0, boolean arg1) {
        this.field321 = arg0;
        this.field327 = arg1;
    }
}
