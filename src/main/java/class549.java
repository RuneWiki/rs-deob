import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class549 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    private int field7502 = 0;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    private int field7509 = -1;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lrh;")
    private class59 field7506 = new class59();

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
    public boolean field7515 = false;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    private int field7513;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    private int field7508;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[[I")
    private int[][] field7510;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[Lkn;")
    private class640[] field7505;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Z")
    public static boolean field7503 = false;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field7512 = 0;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)[[I")
    public final int[][] method3084(int arg0) {
        field7511++;
        if (this.field7513 != this.field7508) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 >= -43) {
            return null;
        }
        while (this.field7508 > var2) {
            this.field7505[var2] = class523.field7239;
            var2++;
        }
        return this.field7510;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)I")
    public static final int method3085(int arg0, int arg1, int arg2) {
        field7516++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg0 == arg2) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
    public static final void method3086(int arg0, boolean arg1) {
        field7507++;
        class373.field5377 = 1000000000L / (long) arg0;
        if (arg1) {
            method3089(null, false);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public final void method3087(int arg0) {
        for (int var2 = arg0; var2 < this.field7508; var2++) {
            this.field7510[var2] = null;
        }
        field7504++;
        this.field7505 = null;
        this.field7510 = null;
        this.field7506.method365(-1);
        this.field7506 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I")
    public final int[] method3088(int arg0, byte arg1) {
        field7514++;
        if (arg1 != 26) {
            this.field7515 = true;
        }
        if (this.field7513 == this.field7508) {
            this.field7515 = this.field7505[arg0] == null;
            this.field7505[arg0] = class523.field7239;
            return this.field7510[arg0];
        } else if (this.field7508 == 1) {
            this.field7515 = this.field7509 != arg0;
            this.field7509 = arg0;
            return this.field7510[0];
        } else {
            class640 var3 = this.field7505[arg0];
            if (var3 == null) {
                this.field7515 = true;
                if (this.field7508 <= this.field7502) {
                    class640 var4 = (class640) this.field7506.method377((byte) 59);
                    var3 = new class640(arg0, var4.field8727);
                    this.field7505[var4.field8726] = null;
                    var4.method175(30604);
                } else {
                    var3 = new class640(arg0, this.field7502);
                    this.field7502++;
                }
                this.field7505[arg0] = var3;
            } else {
                this.field7515 = false;
            }
            this.field7506.method376(true, var3);
            return this.field7510[var3.field8727];
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method3089(String arg0, boolean arg1) {
        field7501++;
        int var2 = arg0.length();
        int var3 = 0;
        if (!arg1) {
            field7512 = 70;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V")
    public class549(int arg0, int arg1, int arg2) {
        this.field7513 = arg1;
        this.field7508 = arg0;
        this.field7510 = new int[this.field7508][arg2];
        this.field7505 = new class640[this.field7513];
    }
}
