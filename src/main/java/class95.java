import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class95 implements class531 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Z")
    public boolean field1175;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J", line = 7)
    public final long method540(int arg0) {
        field1181++;
        if (arg0 != 21242) {
            method542(34, null, 127, (byte) 27, -50, 66);
        }
        long[] var2 = class498.field7478;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field1180) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field1173 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field1173) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field1174 >> 24)) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field1174 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field1174 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field1174) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field1176 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field1177 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field1177 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field1177 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field1177) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field1178) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field1175 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLws;)Z", line = 42)
    public final boolean method541(boolean arg0, class531 arg1) {
        field1179++;
        if (!(arg1 instanceof class95)) {
            return false;
        }
        class95 var3 = (class95) arg1;
        if (!arg0) {
            return true;
        } else if (this.field1180 != var3.field1180) {
            return false;
        } else if (this.field1173 != var3.field1173) {
            return false;
        } else if (this.field1174 != var3.field1174) {
            return false;
        } else if (this.field1176 != var3.field1176) {
            return false;
        } else if (this.field1177 != var3.field1177) {
            return false;
        } else if (this.field1178 == var3.field1178) {
            return this.field1175 == var3.field1175;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[[[BIBII)V", line = 85)
    public static final void method542(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class490.field7410++;
        class57.field699 = 0;
        for (int var6 = class386.field5658; var6 < class487.field7383; var6++) {
            class415[][] var17 = class526.field7777[var6];
            for (int var18 = class580.field8548; var18 < class309.field4509; var18++) {
                for (int var19 = class10.field90; var19 < class605.field8906; var19++) {
                    class415 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class181.field2786[var18 + class67.field763 - class365.field5254][var19 + class67.field763 - class613.field8993] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field5972 = true;
                            var20.field5991 = true;
                            if (var20.field5981 == null) {
                                var20.field5974 = false;
                            } else {
                                var20.field5974 = true;
                            }
                            class57.field699++;
                        } else {
                            var20.field5972 = false;
                            var20.field5991 = false;
                            var20.field5983 = 0;
                            if (var18 >= class365.field5254 - 16 && var18 <= class365.field5254 + 16 && var19 >= class613.field8993 - 16 && var19 <= class613.field8993 + 16 && (var20.field5987 != null || var20.field5978 != null || var20.field5985 != null || var20.field5989 != null || var20.field5976 != null || var20.field5981 != null)) {
                                class298.field4354.method940(var20, (byte) -46);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class287.field4219 == class235.field3455;
        for (int var8 = class386.field5658; var8 < class487.field7383; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class139.field1827.method976() && var8 >= arg2 && arg1 != null) {
                int var10 = class181.field2786.length;
                if (class181.field2786.length + class580.field8548 > class331.field4909) {
                    var10 -= class181.field2786.length + class580.field8548 - class331.field4909;
                }
                int var11 = class181.field2786[0].length;
                if (class181.field2786[0].length + class10.field90 > class366.field5271) {
                    var11 -= class181.field2786[0].length + class10.field90 - class366.field5271;
                }
                int var12 = class272.field4033;
                while (true) {
                    if (var12 >= var10) {
                        class298.field4354.method938(var9, var8, -499625812, true, class235.field3455[var8]);
                        break;
                    }
                    int var13 = class580.field8548 + var12 - class272.field4033;
                    for (int var14 = class493.field7444; var14 < var11; var14++) {
                        class268.field3982[var12][var14] = false;
                        if (class181.field2786[var12][var14]) {
                            int var15 = class10.field90 + var14 - class493.field7444;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class526.field7777[var16][var13][var15] != null && class526.field7777[var16][var13][var15].field5984 == var8) {
                                    class268.field3982[var12][var14] = class526.field7777[var16][var13][var15].field5972;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class298.field4354.method938(var9, var8, -499625812, false, class235.field3455[var8]);
            }
            class298.field4354.method935(5000);
        }
        if (!class516.method3070(true)) {
            class516.method3070(false);
        }
    }
}
