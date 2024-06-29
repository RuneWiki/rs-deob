import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class61 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "B")
    private byte field618;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lwd;")
    public static class357 field628 = new class357(10, 2, 2, 0);

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "[I")
    public static int[] field625;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I", line = 4)
    public final int method324(int arg0) {
        field621++;
        if (arg0 != 786432) {
            method327(-60);
        }
        return this.field618 & 0x7;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I", line = 15)
    public final int method325(int arg0) {
        if (arg0 == -12581) {
            field623++;
            return (this.field618 & 0x8) == 8 ? 1 : 0;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Z", line = 26)
    public static final boolean method326(int arg0) {
        field624++;
        if (class421.field5601 < 1) {
            return false;
        } else {
            if (arg0 >= -50) {
                field628 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V", line = 40)
    public static final void method327(int arg0) {
        if (arg0 > -80) {
            return;
        }
        field620++;
        if (class654.field9173 < 1024.0F) {
            class654.field9173 = 1024.0F;
        }
        if (class654.field9173 > 3072.0F) {
            class654.field9173 = 3072.0F;
        }
        while (class508.field7300 >= 16384.0F) {
            class508.field7300 -= 16384.0F;
        }
        while (class508.field7300 < 0.0F) {
            class508.field7300 += 16384.0F;
        }
        int var1 = class463.field6603 >> 9;
        int var2 = class307.field3793 >> 9;
        int var3 = class593.method3335(class307.field3793, class169.field1888, 27648, class463.field6603);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < (class142.field1574 - 4) && (class140.field1550 - 4) > var2) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class169.field1888;
                    if (var7 < 3 && class568.method3221(var6, var5, 0)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class585.field8307.field8823 != null && class585.field8307.field8823[var7] != null) {
                        var8 = (class585.field8307.field8823[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class156.field1743 != null && class156.field1743[var7] != null) {
                        int var9 = var3 + var8 - class156.field1743[var7].method1608(var6, 840, var5);
                        if (var9 > var4) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class480.field6916) {
            class480.field6916 += (var10 - class480.field6916) / 24;
        } else if (var10 < class480.field6916) {
            class480.field6916 += (var10 - class480.field6916) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V", line = 141)
    public static void method328(int arg0) {
        if (arg0 > 64) {
            field625 = null;
            field628 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 153)
    public class61() {
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lnp;)V", line = 155)
    public class61(class115 arg0) {
        this.field618 = arg0.method657(false);
        this.field622 = arg0.method643((byte) -77);
        this.field626 = arg0.method631(false);
        this.field629 = arg0.method631(false);
        this.field619 = arg0.method631(false);
        this.field627 = arg0.method631(false);
    }
}
