import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class40 extends class30 {

    @OriginalMember(owner = "client!ea", name = "Ob", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!ea", name = "Fb", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!ea", name = "Rb", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "client!ea", name = "Eb", descriptor = "I")
    private int field935;

    @OriginalMember(owner = "client!ea", name = "Pb", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!ea", name = "Gb", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!ea", name = "Mb", descriptor = "Lah;")
    private class9 field943;

    @OriginalMember(owner = "client!ea", name = "Qb", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!ea", name = "Lb", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!ea", name = "Kb", descriptor = "Lgg;")
    public static class63 field941 = class116.method911(43, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ea", name = "Hb", descriptor = "Lgg;")
    public static class63 field938 = class116.method911(43, "");

    @OriginalMember(owner = "client!ea", name = "Jb", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ea", name = "Nb", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!ea", name = "Ib", descriptor = "[[[B")
    public static byte[][][] field939;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Ldf;")
    public final class36 method220(int arg0) {
        if (this.field943 != null) {
            int var2 = class173.field3571 - this.field947;
            if (var2 > 100 && this.field943.field215 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field943.field201[this.field942]) {
                            break label51;
                        }
                        var2 -= this.field943.field201[this.field942];
                        this.field942++;
                    } while (this.field942 < this.field943.field219.length);
                    this.field942 -= this.field943.field215;
                } while (this.field942 >= 0 && this.field943.field219.length > this.field942);
                this.field943 = null;
            }
            this.field947 = class173.field3571 - var2;
        }
        field940++;
        class37 var3 = class167.method1133(true, this.field948);
        if (var3.field897 != null) {
            var3 = var3.method357(-18207);
        }
        if (var3 == null) {
            return null;
        } else if (arg0 == 0) {
            int var4;
            int var5;
            if (this.field935 == 1 || this.field935 == 3) {
                var5 = var3.field893;
                var4 = var3.field914;
            } else {
                var4 = var3.field893;
                var5 = var3.field914;
            }
            int var6 = (var5 >> 1) + this.field945;
            int var7 = (var5 + 1 >> 1) + this.field945;
            int[][] var8 = class81.field1948[this.field937];
            int var9 = (this.field945 << 7) + (var5 << 6);
            int var10 = (this.field946 << 7) + (var4 << 6);
            int var11 = (var4 + 1 >> 1) + this.field946;
            int var12 = (var4 >> 1) + this.field946;
            int var13 = var8[var6][var12] + var8[var7][var12] + var8[var6][var11] + var8[var7][var11] >> 2;
            return var3.method356(var8, var9, (byte) -121, this.field943, var10, this.field942, var13, this.field935, this.field936);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method364(byte arg0) {
        field939 = null;
        field941 = null;
        if (arg0 >= 110) {
            field938 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I[Lhd;[III)V")
    public static final void method365(int arg0, int[] arg1, class69[] arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 <= 0) {
            method365(28, null, null, null, -78, 61);
        }
        field944++;
        if (arg0 <= arg4) {
            return;
        }
        int var6 = arg4 - 1;
        int var7 = (arg0 + arg4) / 2;
        int var8 = arg0 + 1;
        class69 var9 = arg2[var7];
        arg2[var7] = arg2[arg4];
        arg2[arg4] = var9;
        while (var6 < var8) {
            boolean var10 = true;
            do {
                var8--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg3[var11] == 2) {
                        var12 = arg2[var8].field1718;
                        var13 = var9.field1718;
                    } else if (arg3[var11] == 1) {
                        var12 = arg2[var8].field1727;
                        if (var12 == -1 && arg1[var11] == 1) {
                            var12 = 2001;
                        }
                        var13 = var9.field1727;
                        if (var13 == -1 && arg1[var11] == 1) {
                            var13 = 2001;
                        }
                    } else if (arg3[var11] == 3) {
                        var12 = arg2[var8].field1728 ? 1 : 0;
                        var13 = var9.field1728 ? 1 : 0;
                    } else {
                        var13 = var9.field1722;
                        var12 = arg2[var8].field1722;
                    }
                    if (var12 != var13) {
                        if ((arg1[var11] != 1 || var12 <= var13) && (arg1[var11] != 0 || var13 <= var12)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg3[var15] == 2) {
                        var16 = arg2[var6].field1718;
                        var17 = var9.field1718;
                    } else if (arg3[var15] == 1) {
                        var16 = arg2[var6].field1727;
                        var17 = var9.field1727;
                        if (var16 == -1 && arg1[var15] == 1) {
                            var16 = 2001;
                        }
                        if (var17 == -1 && arg1[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg3[var15] == 3) {
                        var17 = var9.field1728 ? 1 : 0;
                        var16 = arg2[var6].field1728 ? 1 : 0;
                    } else {
                        var16 = arg2[var6].field1722;
                        var17 = var9.field1722;
                    }
                    if (var16 != var17) {
                        if ((arg1[var15] != 1 || var16 >= var17) && (arg1[var15] != 0 || var17 >= var16)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var8 > var6) {
                class69 var18 = arg2[var6];
                arg2[var6] = arg2[var8];
                arg2[var8] = var18;
            }
        }
        method365(var8, arg1, arg2, arg3, arg4, 18);
        method365(arg0, arg1, arg2, arg3, var8 + 1, 55);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)J")
    public static final long method366(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        return var3 == null || var3.field2277 == null ? 0L : var3.field2277.field2598;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIZLd;)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class30 arg8) {
        this.field945 = arg4;
        this.field936 = arg1;
        this.field948 = arg0;
        this.field935 = arg2;
        this.field946 = arg5;
        this.field937 = arg3;
        if (arg6 != -1) {
            this.field943 = class49.method480(1000, arg6);
            this.field947 = class173.field3571 - 1;
            this.field942 = 0;
            if (this.field943.field220 == 0 && arg8 != null && arg8 instanceof class40) {
                class40 var10 = (class40) arg8;
                if (this.field943 == var10.field943) {
                    this.field942 = var10.field942;
                    this.field947 = var10.field947;
                    return;
                }
            }
            if (arg7 && this.field943.field215 != -1) {
                this.field942 = (int) ((double) this.field943.field219.length * Math.random());
                this.field947 -= (int) ((double) this.field943.field201[this.field942] * Math.random());
                return;
            }
        }
    }
}
