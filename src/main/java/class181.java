import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class181 extends class544 {

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public int field2175 = 0;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public int field2168 = 2;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Z")
    public boolean field2178 = true;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public int field2172 = 0;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field2167 = 127;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Z")
    public boolean field2171 = true;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public int field2170 = 0;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Z")
    public boolean field2176 = false;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
    public boolean field2181 = true;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public int field2179 = 0;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
    public boolean field2169 = false;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Z")
    public boolean field2189 = true;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "Z")
    public boolean field2186 = true;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "Z")
    public boolean field2187 = true;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public int field2188 = 2;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Z")
    public boolean field2180 = true;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public int field2173 = 1;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public int field2177 = 127;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public int field2174 = 0;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public int field2201 = 3;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public int field2166 = 0;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public int field2191 = 0;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "Z")
    public boolean field2194 = true;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "Z")
    public boolean field2196 = true;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public int field2192 = 127;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Z")
    public boolean field2198 = true;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Z")
    public boolean field2197 = true;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Z")
    public boolean field2193 = true;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    public int field2205 = 2;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Z")
    public boolean field2183 = false;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public int field2204 = 3;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public int field2207 = 2;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lvj;")
    public static class373 field2200 = new class373(3, 5);

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "Z")
    public boolean field2182;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Z")
    public boolean field2184;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "Z")
    public boolean field2185;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILvk;[[B)V", line = 49)
    public static final void method989(int arg0, class308 arg1, byte[][] arg2) {
        field2203++;
        if (arg0 > -123) {
            method994(-127);
        }
        for (int var3 = 0; var3 < arg1.field6670; var3++) {
            class93.method560(true);
            for (int var4 = 0; var4 < (class106.field1289 >> 3); var4++) {
                for (int var5 = 0; var5 < (class422.field5452 >> 3); var5++) {
                    int var6 = class415.field5397[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg1.field6677 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = (var6 & 0xFFD6C8) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class633.field9116.length; var12++) {
                                if (class633.field9116[var12] == var11 && arg2[var12] != null) {
                                    arg1.method1709(var7, var8, (var10 & 0x7) * 8, var5 * 8, class210.field2560, (var9 & 0x7) * 8, arg2[var12], var4 * 8, class309.field3939, var3, -26692);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)I", line = 159)
    public final int method990(int arg0, int arg1) {
        field2202++;
        if (arg1 == -1) {
            return class612.method3519(-23287, arg0) ? this.field2205 : this.field2191;
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Los;Z)V", line = 197)
    public final void method991(class374 arg0, boolean arg1) {
        field2195++;
        arg0.method2093(18, -127);
        arg0.method2093(this.field2201, -125);
        arg0.method2093(this.field2180 ? 1 : 0, -101);
        arg0.method2093(this.field2198 ? 1 : 0, -121);
        arg0.method2093(this.field2187 ? 1 : 0, -122);
        arg0.method2093(this.field2193 ? 1 : 0, -105);
        arg0.method2093(0, -109);
        arg0.method2093(this.field2197 ? 1 : 0, -115);
        arg0.method2093(this.field2181 ? 1 : 0, -125);
        arg0.method2093(this.field2186 ? 1 : 0, -128);
        arg0.method2093(this.field2205, -111);
        arg0.method2093(this.field2191, -102);
        arg0.method2093(this.field2185 ? 1 : 0, -101);
        arg0.method2093(this.field2182 ? 1 : 0, -109);
        arg0.method2093(this.field2189 ? 1 : 0, -122);
        arg0.method2093(this.field2178 ? 1 : 0, -106);
        if (!arg1) {
            this.field2196 = false;
        }
        arg0.method2093(this.field2166, -110);
        arg0.method2093(this.field2171 ? 1 : 0, -122);
        arg0.method2093(this.field2167, -107);
        arg0.method2093(this.field2192, -107);
        arg0.method2093(this.field2177, -107);
        arg0.method2115(this.field2174, 3324);
        arg0.method2115(this.field2179, 3324);
        arg0.method2093(class222.method1281((byte) -17), -109);
        arg0.method2131(this.field2172, -1495157560);
        arg0.method2093(this.field2168, -121);
        arg0.method2093(this.field2176 ? 1 : 0, -104);
        arg0.method2093(this.field2184 ? 1 : 0, -109);
        arg0.method2093(this.field2175, -118);
        arg0.method2093(this.field2169 ? 1 : 0, -118);
        arg0.method2093(this.field2196 ? 1 : 0, -121);
        arg0.method2093(this.field2173, -122);
        arg0.method2093(this.field2194 ? 1 : 0, -113);
        arg0.method2093(this.field2188, -112);
        arg0.method2093(this.field2207, -102);
        arg0.method2093(this.field2183 ? 1 : 0, -101);
        arg0.method2093(this.field2204, -108);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V", line = 262)
    public final void method992(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field2185 = false;
        }
        field2199++;
        if (class612.method3519(-23287, arg1)) {
            this.field2205 = arg0;
        } else {
            this.field2191 = arg0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)Z", line = 278)
    public final boolean method993(int arg0, int arg1) {
        int var3 = 94 / ((arg1 + 43) / 43);
        field2206++;
        return class612.method3519(-23287, arg0) ? this.field2185 : this.field2182;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 304)
    public static void method994(int arg0) {
        field2200 = null;
        if (arg0 != -4469) {
            method989(-56, null, null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZB)V", line = 318)
    public final void method995(int arg0, boolean arg1, byte arg2) {
        if (class612.method3519(-23287, arg0)) {
            this.field2185 = arg1;
        } else {
            this.field2182 = arg1;
        }
        field2165++;
        if (arg2 != 7) {
            this.method991(null, false);
        }
    }
}
