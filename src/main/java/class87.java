import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class87 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "J")
    private long field1192 = -1L;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    private int field1202 = 0;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "J")
    private long field1204 = -1L;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lme;")
    private class497 field1196;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "J")
    private long field1200;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "J")
    private long field1184;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "[B")
    private byte[] field1198;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[B")
    private byte[] field1193;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "J")
    private long field1181;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[[S")
    public static short[][] field1199;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "F")
    public static float field1206;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "J")
    private long field1182;

    static {
        new class375("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field1199 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
        field1195 = 0;
        new class375("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BZ)V", line = 3)
    public final void method561(byte[] arg0, boolean arg1) throws IOException {
        field1203++;
        if (!arg1) {
            this.method565(arg0.length, 0, arg0, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Ljava/io/File;", line = 14)
    private final File method562(int arg0) {
        field1185++;
        if (arg0 != 0) {
            this.field1184 = 2L;
        }
        return this.field1196.method2960((byte) 114);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 32)
    private final void method563(int arg0) throws IOException {
        field1187++;
        if (arg0 != 11670 || this.field1192 == -1L) {
            return;
        }
        if (this.field1192 != this.field1182) {
            this.field1196.method2958(this.field1192, 0);
            this.field1182 = this.field1192;
        }
        this.field1196.method2962(false, this.field1202, this.field1193, 0);
        this.field1182 += this.field1202;
        if (this.field1200 < this.field1182) {
            this.field1200 = this.field1182;
        }
        long var2 = -1L;
        if (this.field1204 <= this.field1192 && this.field1204 + ((long) this.field1194) > this.field1192) {
            var2 = this.field1192;
        } else if (this.field1192 <= this.field1204 && this.field1204 < (long) this.field1202 + this.field1192) {
            var2 = this.field1204;
        }
        long var4 = -1L;
        if (((long) this.field1202 + this.field1192) > this.field1204 && (long) this.field1202 + this.field1192 <= (long) this.field1194 + this.field1204) {
            var4 = (long) this.field1202 + this.field1192;
        } else if (this.field1192 < ((long) this.field1194 + this.field1204) && (long) this.field1202 + this.field1192 >= (long) this.field1194 + this.field1204) {
            var4 = (long) this.field1194 + this.field1204;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class361.method2281(this.field1193, (int) (var2 - this.field1192), this.field1198, (int) (var2 - this.field1204), var6);
        }
        this.field1202 = 0;
        this.field1192 = -1L;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 112)
    private final void method564(int arg0) throws IOException {
        this.field1194 = 0;
        field1188++;
        if (this.field1182 != this.field1181) {
            this.field1196.method2958(this.field1181, 0);
            this.field1182 = this.field1181;
        }
        this.field1204 = this.field1181;
        while (this.field1198.length > this.field1194) {
            int var2 = this.field1198.length - this.field1194;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1196.method2959(this.field1194, var2, (byte) 25, this.field1198);
            if (var3 == -1) {
                break;
            }
            this.field1194 += var3;
            this.field1182 += var3;
        }
        if (arg0 >= 0) {
            method568((byte) -6, 22, 101, -40);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[BB)V", line = 162)
    public final void method565(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field1186++;
        int var5 = 120 / ((80 - arg3) / 37);
        try {
            if ((arg0 + arg1) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field1192 != -1L && this.field1181 >= this.field1192 && this.field1192 + ((long) this.field1202) >= (long) arg0 + this.field1181) {
                class361.method2281(this.field1193, (int) (this.field1181 - this.field1192), arg2, arg1, arg0);
                this.field1181 += arg0;
                return;
            }
            long var6 = this.field1181;
            int var8 = arg1;
            int var9 = arg0;
            if (this.field1181 >= this.field1204 && this.field1181 < (this.field1204 + ((long) this.field1194))) {
                int var10 = (int) (-this.field1181 - (-this.field1204 - (long) this.field1194));
                if (arg0 < var10) {
                    var10 = arg0;
                }
                class361.method2281(this.field1198, (int) (this.field1181 - this.field1204), arg2, arg1, var10);
                arg1 += var10;
                this.field1181 += var10;
                arg0 -= var10;
            }
            if (arg0 > this.field1198.length) {
                this.field1196.method2958(this.field1181, 0);
                this.field1182 = this.field1181;
                while (arg0 > 0) {
                    int var12 = this.field1196.method2959(arg1, arg0, (byte) 25, arg2);
                    if (var12 == -1) {
                        break;
                    }
                    this.field1181 += var12;
                    arg0 -= var12;
                    arg1 += var12;
                    this.field1182 += var12;
                }
            } else if (arg0 > 0) {
                this.method564(-118);
                int var11 = arg0;
                if (arg0 > this.field1194) {
                    var11 = this.field1194;
                }
                class361.method2281(this.field1198, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field1181 += var11;
                arg0 -= var11;
            }
            if (this.field1192 != -1L) {
                if (this.field1192 > this.field1181 && arg0 > 0) {
                    int var13 = (int) (this.field1192 - this.field1181) + arg1;
                    if (var13 > arg0 + arg1) {
                        var13 = arg0 + arg1;
                    }
                    while (arg1 < var13) {
                        arg0--;
                        arg2[arg1++] = 0;
                        this.field1181++;
                    }
                }
                long var14 = -1L;
                if (this.field1192 >= var6 && this.field1192 < (long) var9 + var6) {
                    var14 = this.field1192;
                } else if (this.field1192 <= var6 && ((long) this.field1202 + this.field1192) > var6) {
                    var14 = var6;
                }
                long var16 = -1L;
                if (var6 < ((long) this.field1202 + this.field1192) && this.field1192 + ((long) this.field1202) <= var6 - -((long) var9)) {
                    var16 = (long) this.field1202 + this.field1192;
                } else if (this.field1192 < var6 + ((long) var9) && ((long) var9 + var6) <= ((long) this.field1202 + this.field1192)) {
                    var16 = (long) var9 + var6;
                }
                if (var14 > -1L && var16 > var14) {
                    int var18 = (int) (var16 - var14);
                    class361.method2281(this.field1193, (int) (var14 - this.field1192), arg2, (int) (var14 - var6) + var8, var18);
                    if (this.field1181 < var16) {
                        arg0 = (int) ((long) arg0 - (var16 - this.field1181));
                        this.field1181 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field1182 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V", line = 352)
    public static final void method566(boolean arg0, int arg1) {
        class292.field4350 = arg1;
        if (arg0) {
            method567((byte) 70);
        }
        field1189++;
        class157 var2 = class211.field2971;
        synchronized (class211.field2971) {
            class211.field2971.method1015((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 367)
    public static void method567(byte arg0) {
        field1199 = null;
        if (arg0 != 95) {
            field1199 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIII)V", line = 386)
    public static final void method568(byte arg0, int arg1, int arg2, int arg3) {
        field1190++;
        class377 var4 = class99.method672(arg3, false, 9);
        if (arg0 != -62) {
            field1195 = 100;
        }
        var4.method2340((byte) 127);
        var4.field5762 = arg2;
        var4.field5763 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)J", line = 404)
    public final long method569(boolean arg0) {
        if (arg0) {
            return -76L;
        } else {
            field1205++;
            return this.field1184;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JI)V", line = 417)
    public final void method570(long arg0, int arg1) throws IOException {
        field1201++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method562(0));
        }
        this.field1181 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lme;II)V", line = 586)
    public class87(class497 arg0, int arg1, int arg2) throws IOException {
        this.field1196 = arg0;
        this.field1184 = this.field1200 = arg0.method2957(0);
        this.field1198 = new byte[arg1];
        this.field1193 = new byte[arg2];
        this.field1181 = 0L;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI[BI)V", line = 465)
    public final void method571(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 >= -120) {
            this.method562(-6);
        }
        field1197++;
        try {
            if (this.field1184 < (long) arg3 + this.field1181) {
                this.field1184 = (long) arg3 + this.field1181;
            }
            if (this.field1192 != -1L && (this.field1192 > this.field1181 || (long) this.field1202 + this.field1192 < this.field1181)) {
                this.method563(11670);
            }
            if (this.field1192 != -1L && ((long) this.field1193.length + this.field1192) < (this.field1181 + ((long) arg3))) {
                int var5 = (int) ((long) this.field1193.length + this.field1192 - this.field1181);
                class361.method2281(arg2, arg1, this.field1193, (int) (this.field1181 - this.field1192), var5);
                this.field1181 += var5;
                arg3 -= var5;
                arg1 += var5;
                this.field1202 = this.field1193.length;
                this.method563(11670);
            }
            if (this.field1193.length < arg3) {
                if (this.field1182 != this.field1181) {
                    this.field1196.method2958(this.field1181, 0);
                    this.field1182 = this.field1181;
                }
                this.field1196.method2962(false, arg3, arg2, arg1);
                this.field1182 += arg3;
                if (this.field1200 < this.field1182) {
                    this.field1200 = this.field1182;
                }
                long var6 = -1L;
                if (this.field1181 >= this.field1204 && this.field1181 < this.field1204 + ((long) this.field1194)) {
                    var6 = this.field1181;
                } else if (this.field1181 <= this.field1204 && this.field1204 < ((long) arg3 + this.field1181)) {
                    var6 = this.field1204;
                }
                long var8 = -1L;
                if (this.field1204 < ((long) arg3 + this.field1181) && (long) arg3 + this.field1181 <= (long) this.field1194 + this.field1204) {
                    var8 = (long) arg3 + this.field1181;
                } else if (this.field1181 < (long) this.field1194 + this.field1204 && ((long) arg3 + this.field1181) >= (this.field1204 + ((long) this.field1194))) {
                    var8 = (long) this.field1194 + this.field1204;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class361.method2281(arg2, (int) ((long) arg1 - (this.field1181 - var6)), this.field1198, (int) (var6 - this.field1204), var10);
                }
                this.field1181 += arg3;
            } else if (arg3 > 0) {
                if (this.field1192 == -1L) {
                    this.field1192 = this.field1181;
                }
                class361.method2281(arg2, arg1, this.field1193, (int) (this.field1181 - this.field1192), arg3);
                this.field1181 += arg3;
                if ((this.field1181 - this.field1192) > ((long) this.field1202)) {
                    this.field1202 = (int) (this.field1181 - this.field1192);
                }
            }
        } catch (IOException var12) {
            this.field1182 = -1L;
            throw var12;
        }
    }
}
