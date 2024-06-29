import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class247 {

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    private int field4281 = 0;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    private int field4293 = -1;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Laj;")
    private class1 field4294 = new class1();

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Z")
    public boolean field4295 = false;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[Lel;")
    private class119[] field4279;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[[I")
    private int[][] field4274;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4269 = 0;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lsf;")
    public static class108 field4286 = class140.method973(255, "OK");

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field4280 = 2;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lsf;")
    public static class108 field4275 = class140.method973(255, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lsf;")
    public static class108 field4287 = class140.method973(255, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lsf;")
    public static class108 field4283 = class140.method973(255, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lik;")
    public static class262 field4277;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[Lbb;")
    public static class92[] field4292;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 4)
    public static void method1693(byte arg0) {
        field4277 = null;
        if (arg0 != 114) {
            field4269 = 115;
        }
        field4292 = null;
        field4275 = null;
        field4287 = null;
        field4286 = null;
        field4283 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method1694(boolean arg0) {
        field4288++;
        class324.field5531.method1214(0);
        class1.field23 = null;
        if (arg0) {
            method1700(83, (byte) 106, 114);
        }
        class305.field5312 = 1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)[[I", line = 74)
    public final int[][] method1695(int arg0) {
        field4272++;
        if (this.field4291 != this.field4289) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4289; var2++) {
            this.field4279[var2] = class62.field995;
        }
        return this.field4274;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)I", line = 95)
    public static final int method1696(int arg0, int arg1, byte arg2) {
        field4271++;
        class117 var3 = (class117) class98.field1620.method1676((long) arg1, (byte) -85);
        if (var3 == null) {
            return -1;
        } else if (arg2 <= 25) {
            return -33;
        } else if (arg0 >= 0 && var3.field2028.length > arg0) {
            return var3.field2028[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B[B)[B", line = 125)
    public static final byte[] method1697(byte arg0, byte[] arg1) {
        if (arg0 != 46) {
            field4286 = (class108) null;
        }
        field4284++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class23.method156(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I", line = 150)
    public final int[] method1698(int arg0, int arg1) {
        int var3 = -56 / ((61 - arg0) / 53);
        field4290++;
        if (this.field4291 == this.field4289) {
            this.field4295 = this.field4279[arg1] == null;
            this.field4279[arg1] = class62.field995;
            return this.field4274[arg1];
        } else if (this.field4289 == 1) {
            this.field4295 = this.field4293 != arg1;
            this.field4293 = arg1;
            return this.field4274[0];
        } else {
            class119 var4 = this.field4279[arg1];
            if (var4 == null) {
                this.field4295 = true;
                if (this.field4289 <= this.field4281) {
                    class119 var5 = (class119) this.field4294.method11((byte) 110);
                    var4 = new class119(arg1, var5.field2048);
                    this.field4279[var5.field2043] = null;
                    var5.method1325(0);
                } else {
                    var4 = new class119(arg1, this.field4281);
                    this.field4281++;
                }
                this.field4279[arg1] = var4;
            } else {
                this.field4295 = false;
            }
            this.field4294.method14((byte) 125, var4);
            return this.field4274[var4.field2048];
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I", line = 215)
    public static final int method1699(int arg0) {
        field4285++;
        if (arg0 != -1) {
            method1693((byte) -112);
        }
        return class134.field2315;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)I", line = 227)
    public static final int method1700(int arg0, byte arg1, int arg2) {
        field4273++;
        int var3 = arg2 >>> 31;
        if (arg1 < 39) {
            method1694(false);
        }
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(III)V", line = 283)
    public class247(int arg0, int arg1, int arg2) {
        this.field4289 = arg0;
        this.field4291 = arg1;
        this.field4279 = new class119[this.field4291];
        this.field4274 = new int[this.field4289][arg2];
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 254)
    public final void method1701(int arg0) {
        for (int var2 = 0; var2 < this.field4289; var2++) {
            this.field4274[var2] = null;
        }
        if (arg0 != 2) {
            field4275 = (class108) null;
        }
        this.field4274 = (int[][]) null;
        field4282++;
        this.field4279 = null;
        this.field4294.method9((byte) -106);
        this.field4294 = null;
    }
}
