import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class309 implements class381 {

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Lkc;")
    public static class157 field4196 = new class157("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!go", name = "n", descriptor = "[Z")
    public static boolean[] field4206 = new boolean[5];

    @OriginalMember(owner = "client!go", name = "q", descriptor = "[[I")
    public static int[][] field4209;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "F")
    public static float field4207;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lwl;")
    public static class516 field4200;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Z")
    public boolean field4195;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method1784(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field4201++;
        if (arg3 != -3606) {
            return true;
        }
        boolean var6 = true;
        class319 var7 = new class319(arg2);
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method1883(-32768);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class103 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method1877(arg3 + 3728);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method1869(-96);
                                    }
                                    int var12 = var7.method1877(127);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method1869(arg3 + 3490) >> 2;
                                    var16 = arg5 + var14;
                                    var17 = var13 + arg4;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg0 - 1));
                    } while (var17 >= arg1 - 1);
                    var18 = class452.field6629.method603((byte) 88, var8);
                } while (var15 == 22 && !class76.field1075.field3667 && var18.field1697 == 0 && var18.field1663 != 1 && !var18.field1623);
                if (!var18.method797(arg3 ^ 0xFFFFF187)) {
                    var6 = false;
                    class193.field2814++;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J")
    public final long method1785(int arg0) {
        field4203++;
        if (arg0 != 16088) {
            field4207 = -0.23756652F;
        }
        long[] var2 = class403.field5763;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field4197) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field4194 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field4194 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field4204 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field4204 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4204 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field4204) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field4202 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field4198 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4198 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field4198 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field4198) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field4193 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field4195 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method1786(byte arg0) {
        field4196 = null;
        field4209 = null;
        field4200 = null;
        field4206 = null;
        if (arg0 <= 120) {
            method1784(43, -75, null, 73, -74, 60);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ldk;B)I")
    public static final int method1787(class421 arg0, byte arg1) {
        field4205++;
        int var2 = 0;
        if (arg0.method2517(class376.field5399, (byte) -57)) {
            var2++;
        }
        if (arg0.method2517(class355.field5133, (byte) -75)) {
            var2++;
        }
        if (arg0.method2517(class79.field1115, (byte) -92)) {
            var2++;
        }
        if (arg0.method2517(class437.field6313, (byte) -93)) {
            var2++;
        }
        if (arg0.method2517(class409.field5789, (byte) -104)) {
            var2++;
        }
        int var3 = -27 % ((-arg1 - 32) / 56);
        if (arg0.method2517(class449.field6584, (byte) -65)) {
            var2++;
        }
        if (arg0.method2517(class371.field5319, (byte) -64)) {
            var2++;
        }
        if (arg0.method2517(class434.field6278, (byte) -126)) {
            var2++;
        }
        if (arg0.method2517(class176.field2645, (byte) -121)) {
            var2++;
        }
        if (arg0.method2517(class497.field7280, (byte) -99)) {
            var2++;
        }
        if (arg0.method2517(class136.field2063, (byte) -124)) {
            var2++;
        }
        if (arg0.method2517(class16.field195, (byte) -54)) {
            var2++;
        }
        if (arg0.method2517(class38.field571, (byte) -118)) {
            var2++;
        }
        if (arg0.method2517(class75.field1063, (byte) -66)) {
            var2++;
        }
        if (arg0.method2517(class443.field6383, (byte) -118)) {
            var2++;
        }
        if (arg0.method2517(class35.field540, (byte) -115)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjo;)Z")
    public final boolean method1788(int arg0, class381 arg1) {
        field4199++;
        if (arg0 <= 16) {
            return true;
        } else if ((arg1 instanceof class309)) {
            class309 var3 = (class309) arg1;
            if (this.field4197 != var3.field4197) {
                return false;
            } else if (this.field4194 != var3.field4194) {
                return false;
            } else if (this.field4204 != var3.field4204) {
                return false;
            } else if (this.field4202 != var3.field4202) {
                return false;
            } else if (this.field4198 != var3.field4198) {
                return false;
            } else if (this.field4193 == var3.field4193) {
                return var3.field4195 == this.field4195;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static {
        new class157(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field4209 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
        field4207 = 1.0F;
        field4208 = 1;
    }
}
