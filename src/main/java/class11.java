import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class11 extends class171 {

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[Lcj;")
    public class311[] field217 = new class311[5];

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public int field221 = 0;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "[I")
    public int[] field214 = new int[5];

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lpj;")
    public static class177 field216 = new class177();

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Lok;")
    public static class146 field225 = class235.method1724(-12908, "::shiftclick");

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "Ljava/util/Calendar;")
    public static Calendar field226 = Calendar.getInstance();

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lse;")
    public class11 field208;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Leh;")
    public class162 field210;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lgb;")
    public class164 field205;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lhm;")
    public class19 field223;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Lkf;")
    public class217 field222;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lce;")
    public class241 field213;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lj;")
    public class278 field212;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Z")
    public boolean field207;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Z")
    public boolean field220;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Z")
    public boolean field224;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 10)
    public static void method69(boolean arg0) {
        field216 = null;
        field226 = null;
        field225 = null;
        if (!arg0) {
            field228 = 118;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZLgm;III)V", line = 31)
    public static final void method70(boolean arg0, boolean arg1, class287 arg2, int arg3, int arg4, int arg5) {
        field203++;
        if (class89.field1428 >= 50 || arg2.field4914 == null || arg2.field4914.length <= arg4 || arg2.field4914[arg4] == null) {
            return;
        }
        int var6 = arg2.field4914[arg4][0];
        int var7 = var6 & 0xF;
        int var8 = (var6 & 0x72) >> 4;
        int var9 = var6 >> 8;
        if (arg2.field4914[arg4].length > 1) {
            int var10 = (int) (Math.random() * (double) arg2.field4914[arg4].length);
            if (var10 > 0) {
                var9 = arg2.field4914[arg4][var10];
            }
        }
        if (var7 == 0) {
            if (arg1) {
                class84.method591(var9, 0, var8, 0);
            }
        } else if (class236.field3936 != 0 && !arg0) {
            int var11 = (arg5 - 64) / 128;
            class322.field5503[class89.field1428] = var9;
            int var12 = (arg3 - 64) / 128;
            class174.field2918[class89.field1428] = var8;
            class84.field1330[class89.field1428] = 0;
            class250.field4187[class89.field1428] = null;
            class40.field699[class89.field1428] = (var12 << 16) + (var11 << 8) + var7;
            class89.field1428++;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(III)V", line = 89)
    public class11(int arg0, int arg1, int arg2) {
        this.field206 = this.field209 = arg0;
        this.field215 = arg1;
        this.field229 = arg2;
    }
}
