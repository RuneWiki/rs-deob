import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class152 extends class108 {

    @OriginalMember(owner = "client!un", name = "j", descriptor = "J")
    public long field1996;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B[Ljava/lang/String;[SII)V")
    public static final void method829(byte arg0, String[] arg1, short[] arg2, int arg3, int arg4) {
        field1997++;
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method829((byte) 39, arg1, arg2, arg3, var6 - 1);
            method829((byte) 39, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 == 39) {
            ;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class152() {
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
    public static final void method830() {
        class245.method1513(1, class183.field2341);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(J)V")
    public class152(long arg0) {
        this.field1996 = arg0;
    }
}
