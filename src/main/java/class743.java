import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class743 {

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "Lde;")
    private class534 field10367 = new class534(64);

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "Lnd;")
    private class547 field10364;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
    public int field10368;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "[[Z")
    public static boolean[][] field10363 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
    public static final void method4136(int arg0, int arg1) {
        if (arg0 == 37) {
            class73.field1028 = 3.0F;
        } else if (arg0 == 50) {
            class73.field1028 = 4.0F;
        } else if (arg0 == 75) {
            class73.field1028 = 6.0F;
        } else if (arg0 == 100) {
            class73.field1028 = 8.0F;
        } else if (arg0 == 200) {
            class73.field1028 = 16.0F;
        }
        field10365++;
        class557.field7751 = -1;
        if (arg1 != 29640) {
            method4138(-105);
        }
        class557.field7751 = -1;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZ)Lis;")
    public final class505 method4137(int arg0, boolean arg1) {
        field10362++;
        class534 var3 = this.field10367;
        class505 var4;
        synchronized (this.field10367) {
            var4 = (class505) this.field10367.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            method4136(91, -79);
        }
        class547 var5 = this.field10364;
        byte[] var6;
        synchronized (this.field10364) {
            var6 = this.field10364.method3153(arg0, 0, 19);
        }
        class505 var7 = new class505();
        if (var6 != null) {
            var7.method2949((byte) 42, new class461(var6));
        }
        class534 var8 = this.field10367;
        synchronized (this.field10367) {
            this.field10367.method3077((byte) -37, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public static void method4138(int arg0) {
        field10363 = null;
        if (arg0 != -4088) {
            method4139(null, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lvl;B)V")
    public static final void method4139(class13 arg0, byte arg1) {
        if (arg1 != 7) {
            field10363 = null;
        }
        field10366++;
        if (arg0.field157 == null && arg0.field207 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.field157.length; var3++) {
            int var4 = -1;
            if (arg0.field157 != null) {
                var4 = arg0.field157[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    var9 = arg0.field5801 - ((var8 - class332.field4232) * 512 + 256);
                    int var10 = var7 & 0x3FFF;
                    var11 = arg0.field5797 - ((var10 - class447.field5936) * 512 + 256);
                } else if ((var4 & 0x8000) == 0) {
                    class592 var14 = (class592) class207.field2745.method1160((long) var4, 124);
                    if (var14 == null) {
                        arg0.method81(-1, (byte) 75, var3);
                        continue;
                    }
                    class733 var15 = var14.field8280;
                    var11 = arg0.field5797 - var15.field5797;
                    var9 = arg0.field5801 - var15.field5801;
                } else {
                    int var12 = var4 & 0x7FFF;
                    class724 var13 = class5.field49[var12];
                    if (var13 == null) {
                        arg0.method81(-1, (byte) 82, var3);
                        continue;
                    }
                    var9 = arg0.field5801 - var13.field5801;
                    var11 = arg0.field5797 - var13.field5797;
                }
                if (var9 != 0 || var11 != 0) {
                    arg0.method81((int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF, (byte) 97, var3);
                }
            } else if (!arg0.method81(-1, (byte) 121, var3)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field207 = null;
            arg0.field157 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lal;ILnd;)V")
    public class743(class102 arg0, int arg1, class547 arg2) {
        this.field10364 = arg2;
        this.field10368 = this.field10364.method3178((byte) 52, 19);
    }
}
