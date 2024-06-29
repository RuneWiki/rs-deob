import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Ljn;")
    public static class134 field7 = new class134(40, 4);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I", line = 4)
    public final int method1(byte arg0) {
        field10++;
        if (arg0 > -97) {
            this.toString();
        }
        return this.field5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;", line = 21)
    public static final String method2(String[] arg0, int arg1, int arg2, byte arg3) {
        field6++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            if (arg3 != -13) {
                field8 = 109;
            }
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILgs;)V", line = 83)
    public static final void method3(int arg0, int arg1, class432 arg2) {
        class688.field9599 = 0;
        field4++;
        class356.field5140 = false;
        class300.method1958(85, arg2);
        class777.method4282(14187, arg2);
        if (class356.field5140) {
            System.out.println("---endgpp---");
        }
        if (arg1 != -24775) {
            method6(-1);
        }
        if (arg2.field6962 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field6962 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)Z", line = 105)
    public static final boolean method4(int arg0, int arg1, byte arg2) {
        field1++;
        if (arg2 < 111) {
            field8 = -40;
        }
        return (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 116)
    public static void method5(int arg0) {
        if (arg0 < 101) {
            field7 = null;
        }
        field7 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 128)
    public static final void method6(int arg0) {
        field11++;
        if (arg0 != 27828) {
            field8 = -124;
        }
        client.field1307.method186(class742.field10229, class531.field7310, class181.field2289);
    }

    @OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;", line = 147)
    public final String toString() {
        field2++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(II)V", line = 154)
    public class1(int arg0, int arg1) {
        this.field3 = arg1;
        this.field5 = arg0;
    }
}
