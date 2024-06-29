import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class118 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lvl;")
    private class6 field1639 = new class6((byte[]) null);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[B")
    private static byte[] field1640 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "J")
    private long field1645;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
    private int[] field1641;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
    private int[] field1644;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
    public int[] field1646;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "[I")
    private int[] field1647;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()Z", line = 3)
    public final boolean method835() {
        return this.field1639.field115 != null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(J)V", line = 6)
    public final void method836(long arg0) {
        this.field1645 = arg0;
        int var3 = this.field1644.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1646[var4] = 0;
            this.field1647[var4] = 0;
            this.field1639.field111 = this.field1641[var4];
            this.method842(var4);
            this.field1644[var4] = this.field1639.field111;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)J", line = 25)
    public final long method837(int arg0) {
        return (long) this.field1643 * (long) arg0 + this.field1645;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 28)
    public final void method838() {
        this.field1639.field115 = null;
        this.field1641 = null;
        this.field1644 = null;
        this.field1646 = null;
        this.field1647 = null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()V", line = 39)
    public final void method839() {
        this.field1639.field111 = -1;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()V", line = 42)
    public static void method840() {
        field1640 = null;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "()Z", line = 49)
    public final boolean method841() {
        int var1 = this.field1644.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1644[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 64)
    public final void method842(int arg0) {
        int var2 = this.field1639.method29(-121);
        this.field1646[arg0] += var2;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 71)
    public final void method843(int arg0) {
        this.field1644[arg0] = this.field1639.field111;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "()I", line = 76)
    public final int method844() {
        int var1 = this.field1644.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1644[var4] >= 0 && this.field1646[var4] < var3) {
                var2 = var4;
                var3 = this.field1646[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "()I", line = 101)
    public final int method845() {
        return this.field1644.length;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)I", line = 106)
    public final int method846(int arg0) {
        return this.method849(arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 112)
    private final int method847(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1640[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1639.method58(-288140008) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1639.method58(-288140008) << 16;
            }
            return var8;
        }
        int var3 = this.field1639.method58(-288140008);
        int var4 = this.field1639.method29(-78);
        if (var3 == 47) {
            this.field1639.field111 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1639.method31(-22888);
            var4 -= 3;
            int var6 = this.field1646[arg0];
            this.field1645 += (long) (this.field1643 - var5) * (long) var6;
            this.field1643 = var5;
            this.field1639.field111 += var4;
            return 2;
        } else {
            this.field1639.field111 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([B)V", line = 154)
    public final void method848(byte[] arg0) {
        this.field1639.field115 = arg0;
        this.field1639.field111 = 10;
        int var2 = this.field1639.method39((byte) 119);
        this.field1642 = this.field1639.method39((byte) 29);
        this.field1643 = 500000;
        this.field1641 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1639.method73((byte) 19);
            int var5 = this.field1639.method73((byte) 19);
            if (var4 == 1297379947) {
                this.field1641[var3] = this.field1639.field111;
                var3++;
            }
            this.field1639.field111 += var5;
        }
        this.field1645 = 0L;
        this.field1644 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1644[var6] = this.field1641[var6];
        }
        this.field1646 = new int[var2];
        this.field1647 = new int[var2];
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I", line = 208)
    private final int method849(int arg0) {
        byte var2 = this.field1639.field115[this.field1639.field111];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1647[arg0] = var3;
            this.field1639.field111++;
        } else {
            var3 = this.field1647[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method847(arg0, var3);
        }
        int var4 = this.field1639.method29(-106);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1639.field115[this.field1639.field111] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1639.field111++;
                this.field1647[arg0] = var5;
                return this.method847(arg0, var5);
            }
        }
        this.field1639.field111 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V", line = 246)
    public final void method850(int arg0) {
        this.field1639.field111 = this.field1644[arg0];
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 264)
    public class118() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V", line = 266)
    public class118(byte[] arg0) {
        this.method848(arg0);
    }
}
