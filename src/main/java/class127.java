import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class127 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lhb;")
    private class35 field2002 = new class35((byte[]) null);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[B")
    private static byte[] field2001 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "J")
    private long field2003;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    private int[] field2005;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    public int[] field2007;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    private int[] field2008;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
    private int[] field2009;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I", line = 3)
    private final int method958(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2001[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2002.method273(65280) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2002.method273(65280) << 16;
            }
            return var8;
        }
        int var3 = this.field2002.method273(65280);
        int var4 = this.field2002.method238((byte) 41);
        if (var3 == 47) {
            this.field2002.field455 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2002.method269(false);
            var4 -= 3;
            int var6 = this.field2007[arg0];
            this.field2003 += (long) (this.field2006 - var5) * (long) var6;
            this.field2006 = var5;
            this.field2002.field455 += var4;
            return 2;
        } else {
            this.field2002.field455 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()Z", line = 45)
    public final boolean method959() {
        return this.field2002.field437 != null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()I", line = 50)
    public final int method960() {
        int var1 = this.field2009.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2009[var4] >= 0 && this.field2007[var4] < var3) {
                var2 = var4;
                var3 = this.field2007[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)J", line = 75)
    public final long method961(int arg0) {
        return (long) this.field2006 * (long) arg0 + this.field2003;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)I", line = 81)
    public final int method962(int arg0) {
        return this.method970(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 88)
    public final void method963(int arg0) {
        this.field2009[arg0] = this.field2002.field455;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(J)V", line = 92)
    public final void method964(long arg0) {
        this.field2003 = arg0;
        int var3 = this.field2009.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2007[var4] = 0;
            this.field2008[var4] = 0;
            this.field2002.field455 = this.field2005[var4];
            this.method971(var4);
            this.field2009[var4] = this.field2002.field455;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B)V", line = 110)
    public final void method965(byte[] arg0) {
        this.field2002.field437 = arg0;
        this.field2002.field455 = 10;
        int var2 = this.field2002.method300(-1394191632);
        this.field2004 = this.field2002.method300(-1394191632);
        this.field2006 = 500000;
        this.field2005 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2002.method299(-74);
            int var5 = this.field2002.method299(-105);
            if (var4 == 1297379947) {
                this.field2005[var3] = this.field2002.field455;
                var3++;
            }
            this.field2002.field455 += var5;
        }
        this.field2003 = 0L;
        this.field2009 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2009[var6] = this.field2005[var6];
        }
        this.field2007 = new int[var2];
        this.field2008 = new int[var2];
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()Z", line = 164)
    public final boolean method966() {
        int var1 = this.field2009.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2009[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()V", line = 177)
    public static void method967() {
        field2001 = null;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()V", line = 180)
    public final void method968() {
        this.field2002.field455 = -1;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()V", line = 183)
    public final void method969() {
        this.field2002.field437 = null;
        this.field2005 = null;
        this.field2009 = null;
        this.field2007 = null;
        this.field2008 = null;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)I", line = 193)
    private final int method970(int arg0) {
        byte var2 = this.field2002.field437[this.field2002.field455];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2008[arg0] = var3;
            this.field2002.field455++;
        } else {
            var3 = this.field2008[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method958(arg0, var3);
        }
        int var4 = this.field2002.method238((byte) 86);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2002.field437[this.field2002.field455] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2002.field455++;
                this.field2008[arg0] = var5;
                return this.method958(arg0, var5);
            }
        }
        this.field2002.field455 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 233)
    public final void method971(int arg0) {
        int var2 = this.field2002.method238((byte) 66);
        this.field2007[arg0] += var2;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 244)
    public final void method972(int arg0) {
        this.field2002.field455 = this.field2009[arg0];
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "()I", line = 247)
    public final int method973() {
        return this.field2009.length;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 264)
    public class127() {
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V", line = 266)
    public class127(byte[] arg0) {
        this.method965(arg0);
    }
}
