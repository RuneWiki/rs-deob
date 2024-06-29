import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class83 implements class81 {

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "Lle;")
    public class311 field1003;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "Lqj;")
    public class512 field998;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Ljava/lang/String;")
    public String field993;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field1002;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V", line = 8)
    public static void method645(boolean arg0) {
        if (arg0) {
            field1002 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([BI)[B", line = 29)
    public static final byte[] method646(byte[] arg0, int arg1) {
        field994++;
        class677 var2 = new class677(arg0);
        if (arg1 != 22047) {
            method646(null, -109);
        }
        int var3 = var2.method3821((byte) 100);
        int var4 = var2.method3799(false);
        if (var4 < 0 || !(class512.field6798 == 0 || class512.field6798 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method3801(var8, 0, var4, arg1 - 21966);
            return var8;
        } else {
            int var5 = var2.method3799(false);
            if (var5 < 0 || !(class512.field6798 == 0 || class512.field6798 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class623.method3434(var6, var5, arg0, var4, 9);
            } else {
                class554 var7 = class175.field2644;
                synchronized (class175.field2644) {
                    class175.field2644.method3086(var2, var6, 116);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)Lmha;", line = 89)
    public final class419 method112(byte arg0) {
        field1005++;
        return arg0 == 62 ? class21.field390 : null;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Ljava/lang/String;Lle;Lqj;IIIIIIIIII)V", line = 104)
    public class83(String arg0, class311 arg1, class512 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field1003 = arg1;
        this.field1000 = arg9;
        this.field1004 = arg6;
        this.field998 = arg2;
        this.field1001 = arg3;
        this.field1007 = arg7;
        this.field997 = arg8;
        this.field996 = arg11;
        this.field1006 = arg4;
        this.field995 = arg12;
        this.field993 = arg0;
        this.field999 = arg5;
        this.field1008 = arg10;
    }
}
