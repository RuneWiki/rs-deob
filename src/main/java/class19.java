import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FUZJMGZB")
public class class19 {

    @OriginalMember(owner = "client!FUZJMGZB", name = "a", descriptor = "Z")
    private boolean field905 = true;

    @OriginalMember(owner = "client!FUZJMGZB", name = "b", descriptor = "I")
    private int field906 = -610;

    @OriginalMember(owner = "client!FUZJMGZB", name = "c", descriptor = "Z")
    private boolean field907 = false;

    @OriginalMember(owner = "client!FUZJMGZB", name = "e", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!FUZJMGZB", name = "j", descriptor = "Z")
    private boolean field914;

    @OriginalMember(owner = "client!FUZJMGZB", name = "d", descriptor = "[B")
    public byte[] field908;

    @OriginalMember(owner = "client!FUZJMGZB", name = "f", descriptor = "[I")
    public int[] field910;

    @OriginalMember(owner = "client!FUZJMGZB", name = "g", descriptor = "[I")
    public int[] field911;

    @OriginalMember(owner = "client!FUZJMGZB", name = "h", descriptor = "[I")
    public int[] field912;

    @OriginalMember(owner = "client!FUZJMGZB", name = "i", descriptor = "[I")
    public int[] field913;

    @OriginalMember(owner = "client!FUZJMGZB", name = "<init>", descriptor = "(I[B)V")
    public class19(int arg0, byte[] arg1) {
        this.method276(arg1, (byte) -24);
        if (arg0 != 0) {
            this.field905 = !this.field905;
        }
    }

    @OriginalMember(owner = "client!FUZJMGZB", name = "a", descriptor = "([BB)V")
    private void method276(byte[] arg0, byte arg1) {
        class32 var3 = new class32((byte) 114, arg0);
        if (arg1 != -24) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = var3.method373();
        int var6 = var3.method373();
        if (var5 == var6) {
            this.field908 = arg0;
            this.field914 = false;
        } else {
            byte[] var7 = new byte[var5];
            class27.method339(var7, var5, arg0, var6, 6);
            this.field908 = var7;
            var3 = new class32((byte) 114, this.field908);
            this.field914 = true;
        }
        this.field909 = var3.method371();
        this.field910 = new int[this.field909];
        this.field911 = new int[this.field909];
        this.field912 = new int[this.field909];
        this.field913 = new int[this.field909];
        int var8 = this.field909 * 10 + var3.field1032;
        for (int var9 = 0; var9 < this.field909; var9++) {
            this.field910[var9] = var3.method374();
            this.field911[var9] = var3.method373();
            this.field912[var9] = var3.method373();
            this.field913[var9] = var8;
            var8 += this.field912[var9];
        }
    }

    @OriginalMember(owner = "client!FUZJMGZB", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method277(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field909; var6++) {
            if (this.field910[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field911[var6]];
                }
                if (this.field914) {
                    for (int var7 = 0; var7 < this.field911[var6]; var7++) {
                        arg1[var7] = this.field908[this.field913[var6] + var7];
                    }
                } else {
                    class27.method339(arg1, this.field911[var6], this.field908, this.field912[var6], this.field913[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
