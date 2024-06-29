import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class113 extends class404 {

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field1815;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Lit;")
    private class681 field1811;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Ltaa;")
    private class136 field1810;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Ldc;")
    public static class303 field1812 = new class303(15, 0, 1, 0);

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "Lvh;")
    public static class125 field1819 = new class125(68, 8);

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "[[B")
    public static byte[][] field1805;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method913(int arg0) {
        field1809++;
        if (arg0 != -10406) {
            return;
        }
        try {
            this.field1815.close();
        } catch (IOException var2) {
        }
        this.field1811.method3852(-81);
        this.field1810.method1039(arg0 + 10406);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II[BI[BIIIB)V")
    public static final void method914(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1808++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg4[var10001] += arg2[arg1++];
                int var14 = arg7++;
                arg4[var14] += arg2[arg1++];
                int var15 = arg7++;
                arg4[var15] += arg2[arg1++];
                int var16 = arg7++;
                arg4[var16] += arg2[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg4[var10001] += arg2[arg1++];
            }
            arg7 += arg0;
            arg1 += arg5;
        }
        if (arg8 != 104) {
            method917('K', -73);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)Z")
    public static final boolean method915(int arg0, int arg1) {
        if (arg1 > -47) {
            field1805 = null;
        }
        field1820++;
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public final void method916(byte arg0) {
        if (arg0 <= -12) {
            field1818++;
            this.field1811.method3853((byte) -83);
            this.field1810.method1040(-1);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(CI)Z")
    public static final boolean method917(char arg0, int arg1) {
        field1807++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class242.method1564(arg0, 1)) {
            return true;
        } else {
            char[] var2 = class295.field4124;
            for (int var3 = arg1; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class611.field8774;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[B)I")
    public final int method918(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1821++;
        if (arg0 != 19001) {
            this.field1810 = null;
        }
        return this.field1811.method3854(1, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!dv", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method913(-10406);
        field1814++;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)[Lmf;")
    public static final class409[] method919(boolean arg0) {
        if (arg0) {
            field1812 = null;
        }
        field1816++;
        return new class409[] { class370.field5123, class234.field3469, class10.field128 };
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class113(Socket arg0, int arg1) throws IOException {
        this.field1815 = arg0;
        this.field1815.setSoTimeout(30000);
        this.field1815.setTcpNoDelay(true);
        this.field1811 = new class681(this.field1815.getInputStream(), arg1);
        this.field1810 = new class136(this.field1815.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method920(int arg0) {
        if (arg0 != 0) {
            method919(true);
        }
        field1812 = null;
        field1819 = null;
        field1805 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Z")
    public final boolean method921(int arg0, int arg1) throws IOException {
        field1813++;
        if (arg1 != -5794) {
            method917((char) 65535, -21);
        }
        return this.field1811.method3855(arg0, false);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIIB)V")
    public final void method922(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        this.field1810.method1038(arg1, -1, arg0, arg2);
        if (arg3 < 108) {
            this.field1811 = null;
        }
        field1817++;
    }
}
