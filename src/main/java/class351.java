import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class351 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[Lfc;")
    public static class429[] field5214 = new class429[6];

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field5217 = 104;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Luh;")
    public static class414 field5212;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method2316(byte arg0) {
        if (arg0 < 29) {
            field5215 = 99;
        }
        field5214 = null;
        field5212 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI[III)V")
    public static final void method2317(boolean arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg3--;
        if (arg0) {
            field5215 = 94;
        }
        field5216++;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var11 = var10 + 1;
            arg2[var11] = arg4;
            int var12 = var11 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg3 = var13 + 1;
            arg2[arg3] = arg4;
        }
        while (arg3 < var6) {
            arg3++;
            arg2[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method2318(int arg0) {
        field5213++;
        if (arg0 != -191 || class322.field4796) {
            return;
        }
        class322.field4796 = true;
        class164.field2233 = true;
        if (class331.field4880) {
            class247.field3479 = (float) ((int) class247.field3479 + 191 & 0xFFFFFF80);
        } else {
            class267.field3961 += (24.0F - class267.field3961) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILt;)Lt;")
    public abstract class365 method235(int arg0, class365 arg1);
}
