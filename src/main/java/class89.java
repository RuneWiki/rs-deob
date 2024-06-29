import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class89 extends class337 {

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lfca;")
    public class661 field1228 = new class661();

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[I")
    public static int[] field1227 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method542(byte arg0, int arg1, int arg2) {
        field1230++;
        if (!class525.field6678) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class647.field8259[var3] == null || class647.field8259[var3][var4] == null) {
            return false;
        } else if (arg0 == 6) {
            class391 var5 = class647.field8259[var3][var4];
            if (arg1 == -1 && var5.field5007 == 0) {
                for (class765 var6 = (class765) class595.field7563.method3591(0); var6 != null; var6 = (class765) class595.field7563.method3600((byte) 82)) {
                    if (var6.field10412 == 9 || var6.field10412 == 1012 || var6.field10412 == 45 || var6.field10412 == 52 || var6.field10412 == 18) {
                        for (class391 var7 = class738.method4006(64, var6.field10402); var7 != null; var7 = class679.method3655(var7, 0)) {
                            if (var5.field5151 == var7.field5151) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class765 var8 = (class765) class595.field7563.method3591(0); var8 != null; var8 = (class765) class595.field7563.method3600((byte) 123)) {
                    if (var8.field10413 == arg1 && var5.field5151 == var8.field10402 && (var8.field10412 == 9 || var8.field10412 == 1012 || var8.field10412 == 45 || var8.field10412 == 52 || var8.field10412 == 18)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 73)
    public static void method543(int arg0) {
        if (arg0 == -19) {
            field1227 = null;
        }
    }
}
