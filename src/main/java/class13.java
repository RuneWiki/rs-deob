import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class13 extends class108 {

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "Z")
    private boolean field143;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "Z")
    private boolean field140;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "[[I")
    public static int[][] field141 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "Lbv;")
    public static class567 field139 = new class567("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)I", line = 3)
    public static final int method73(int arg0, byte arg1) {
        field135++;
        if (arg1 != -83) {
            method75(-6);
        }
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V", line = 31)
    public static void method74(byte arg0) {
        field141 = null;
        field139 = null;
        if (arg0 != 80) {
            method74((byte) -10);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 46)
    public static final void method75(int arg0) {
        field145++;
        if (class307.field4425) {
            return;
        }
        class521.field7236 = true;
        if (class202.field2854.field7903) {
            class523.field7256 = ((int) class523.field7256 + 191 & 0xFFFFFF80);
        } else {
            class563.field8074 += (24.0F - class563.field8074) / 2.0F;
        }
        class307.field4425 = true;
        if (arg0 != 0) {
            method75(-102);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILco;)V", line = 79)
    public final void method76(int arg0, class268 arg1) {
        arg1.method1710(2, 59);
        field137++;
        arg1.method1710(this.field144, 21);
        arg1.method1710(this.field143 ? 1 : 0, 68);
        arg1.method1710(this.field142, arg0 ^ 0x52);
        arg1.method1710(this.field134, 117);
        arg1.method1710(this.field133, 96);
        arg1.method1710(this.field132, 111);
        arg1.method1710(this.field140 ? 1 : 0, 113);
        if (arg0 != 0) {
            this.field146 = -111;
        }
        arg1.method1699(true, this.field138);
        arg1.method1710(this.field136, 111);
        arg1.method1715(this.field146, (byte) -27);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(ZLae;)V", line = 100)
    public class13(boolean arg0, class40 arg1) {
        if (arg0) {
            if (class40.field564.startsWith("win")) {
                this.field144 = 1;
            } else if (class40.field564.startsWith("mac")) {
                this.field144 = 2;
            } else if (class40.field564.startsWith("linux")) {
                this.field144 = 3;
            } else {
                this.field144 = 4;
            }
            if (class40.field561.startsWith("amd64") || class40.field561.startsWith("x86_64")) {
                this.field143 = true;
            } else {
                this.field143 = false;
            }
            if (class40.field560.toLowerCase().indexOf("sun") != -1) {
                this.field142 = 1;
            } else if (class40.field560.toLowerCase().indexOf("microsoft") != -1) {
                this.field142 = 2;
            } else if (class40.field560.toLowerCase().indexOf("apple") == -1) {
                this.field142 = 4;
            } else {
                this.field142 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class40.field562.length() > var3) {
                    char var5 = class40.field562.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field134 = var4;
            int var6 = 0;
            int var7 = class40.field562.indexOf(46, 2) + 1;
            try {
                while (class40.field562.length() > var7) {
                    char var8 = class40.field562.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 - (48 - var8);
                    var7++;
                }
            } catch (Exception var14) {
            }
            this.field133 = var6;
            int var9 = class40.field562.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class40.field562.length()) {
                    char var11 = class40.field562.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 - (48 - var11);
                    var9++;
                }
            } catch (Exception var13) {
            }
            this.field138 = class555.field7861;
            if (class40.field554 == 3) {
                this.field140 = true;
            } else {
                this.field140 = false;
            }
            if (this.field134 > 3) {
                this.field136 = class605.field8613;
            } else {
                this.field136 = 0;
            }
            this.field132 = var10;
            try {
                this.field146 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field146 = 0;
            }
        }
    }
}
