import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class506 extends class577 {

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "Z")
    public boolean field7194 = false;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "Z")
    public boolean field7197 = true;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
    public int field7187;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
    public int field7188;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "I")
    public int field7189;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
    public int field7190;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
    public int field7192;

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!cga", name = "x", descriptor = "I")
    public int field7199;

    @OriginalMember(owner = "client!cga", name = "y", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!cga", name = "A", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "Lmi;")
    public class520 field7195;

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "[[B")
    public static byte[][] field7191;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "([SIBI[Ljava/lang/String;)V")
    public static final void method3050(short[] arg0, int arg1, byte arg2, int arg3, String[] arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg3; var9 < arg1; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var8;
            method3050(arg0, var6 - 1, (byte) -46, arg3, arg4);
            method3050(arg0, arg1, (byte) 108, var6 + 1, arg4);
        }
        field7196++;
        int var12 = -26 / ((56 - arg2) / 51);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static void method3051(int arg0) {
        field7191 = null;
        int var1 = -3 / ((arg0 + 10) / 57);
    }
}
