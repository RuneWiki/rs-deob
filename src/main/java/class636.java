import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class636 extends class219 {

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "Ljo;")
    public static class351 field8948 = new class351(90, 4);

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    public static int field8960 = 0;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    public static int field8961 = 0;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "Ljava/lang/String;")
    public String field8952;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "[C")
    public char[] field8955;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "[C")
    public char[] field8958;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "[I")
    public int[] field8950;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "[I")
    public int[] field8957;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZC)I", line = 7)
    public final int method3619(boolean arg0, char arg1) {
        field8954++;
        if (this.field8950 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8950.length; var3++) {
            if (this.field8955[var3] == arg1) {
                return this.field8950[var3];
            }
        }
        if (arg0) {
            this.field8950 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(JI)V", line = 33)
    public static final void method3620(long arg0, int arg1) {
        field8949++;
        int var3 = class75.field1009;
        int var4 = class579.field8185;
        if (class4.field54 != var3) {
            int var5 = var3 - class4.field54;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class4.field54 += var6;
        }
        class562.field8001 += (float) arg0 * class318.field4733 / 40.0F * 8.0F;
        if (class238.field3434 != var4) {
            int var7 = var4 - class238.field3434;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class238.field3434 += var8;
        }
        class509.field7256 += (float) arg0 * class243.field3478 / 40.0F * 8.0F;
        class182.method1363(true);
        int var9 = 30 % ((30 - arg1) / 40);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(CB)I", line = 110)
    public final int method3621(char arg0, byte arg1) {
        field8956++;
        if (this.field8957 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8957.length; var3++) {
            if (this.field8958[var3] == arg0) {
                return this.field8957[var3];
            }
        }
        int var4 = -11 / ((arg1 - 9) / 38);
        return -1;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lrv;BI)V", line = 139)
    private final void method3622(class120 arg0, byte arg1, int arg2) {
        field8951++;
        if (arg2 == 1) {
            this.field8952 = arg0.method861(true);
        } else if (arg2 == 2) {
            int var4 = arg0.method842(2384);
            this.field8950 = new int[var4];
            this.field8955 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8950[var5] = arg0.method898((byte) -111);
                byte var6 = arg0.method877(-252);
                this.field8955[var5] = var6 == 0 ? 0 : class262.method1721(var6, -127);
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method842(2384);
            this.field8957 = new int[var7];
            this.field8958 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8957[var8] = arg0.method898((byte) -97);
                byte var9 = arg0.method877(-252);
                this.field8958[var8] = var9 == 0 ? 0 : class262.method1721(var9, -48);
            }
        }
        int var10 = 111 % ((arg1 + 17) / 60);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lrv;I)V", line = 203)
    public final void method3623(class120 arg0, int arg1) {
        if (arg1 != 14864) {
            this.method3621('z', (byte) -66);
        }
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                field8959++;
                return;
            }
            this.method3622(arg0, (byte) 105, var3);
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V", line = 224)
    public static void method3624(int arg0) {
        field8948 = null;
        if (arg0 != 1) {
            field8961 = 17;
        }
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V", line = 239)
    public final void method3625(int arg0) {
        field8953++;
        if (this.field8957 != null) {
            for (int var2 = 0; var2 < this.field8957.length; var2++) {
                this.field8957[var2] = class281.method1904(this.field8957[var2], 32768);
            }
        }
        if (arg0 == -15704 && this.field8950 != null) {
            for (int var3 = 0; var3 < this.field8950.length; var3++) {
                this.field8950[var3] = class281.method1904(this.field8950[var3], 32768);
            }
        }
    }
}
