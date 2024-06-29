import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class63 {

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "Z")
    private boolean field765 = false;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public int field766 = 443;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "I")
    public int field767 = 43594;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "Z")
    private boolean field768 = true;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "[I")
    public static int[] field756 = null;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "Ljava/lang/String;")
    public String field760;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ltd;Z)Lhu;", line = 4)
    public final class141 method416(class477 arg0, boolean arg1) {
        field762++;
        if (arg1) {
            this.field766 = -7;
        }
        return arg0.method2842(96, this.field768 ? this.field766 : this.field767, this.field760, this.field765);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V", line = 15)
    public final void method417(byte arg0) {
        if (arg0 >= -44) {
            this.field768 = false;
        }
        if (!this.field768) {
            this.field765 = true;
            this.field768 = true;
        } else if (this.field765) {
            this.field765 = false;
        } else {
            this.field768 = false;
        }
        field758++;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V", line = 48)
    public static void method418(int arg0) {
        field756 = null;
        if (arg0 >= -18) {
            field759 = -121;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBLfb;I)V", line = 61)
    public static final void method419(int arg0, byte arg1, class702 arg2, int arg3) {
        field755++;
        if (arg1 == 4) {
            int[] var4 = new int[4];
            class595.method3470(var4, 0, var4.length, arg3);
            class749.method4173(var4, 19523, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V", line = 75)
    public static final void method420(int arg0) {
        field757++;
        if (arg0 != -7858) {
            return;
        }
        int var1 = class506.field7191.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class506.field7191[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class315.field4485; var4++) {
                    if (class551.field7919[var2] == class153.field2169[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class153.field2169[class315.field4485] = class551.field7919[var2];
                    var3 = class315.field4485++;
                }
                class494 var5 = new class494(class506.field7191[var2]);
                int var6 = 0;
                while (class506.field7191[var2].length > var5.field7042 && var6 < 511 && class235.field3545 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2998(true);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FE4) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class551.field7919[var2] >> 8) * 64 + var10 - class124.field1922;
                    int var13 = (class551.field7919[var2] & 0xFF) * 64 + var11 - class88.field999;
                    class110 var14 = class575.field8103.method2439((byte) 73, var5.method2998(true));
                    class205 var15 = (class205) class645.field9014.method2242((long) var7, -1);
                    if (var15 == null && (var14.field1652 & 0x1) > 0 && class481.field6761 == var9 && var12 >= 0 && var12 + var14.field1635 < class768.field10571 && var13 >= 0 && (var14.field1635 + var13) < class350.field4898) {
                        class665 var16 = new class665();
                        var16.field4640 = var7;
                        class205 var17 = new class205(var16);
                        class645.field9014.method2241(-107, (long) var7, var17);
                        class164.field2601[class36.field483++] = var17;
                        class216.field3356[class235.field3545++] = var7;
                        var16.field4633 = class192.field2961;
                        var16.method3783(var14, -2);
                        var16.method2095(var16.field9240.field1635, 0);
                        var16.field4619 = var16.field9240.field1634 << 3;
                        var16.method2103(false, true, var16.field9240.field1654 + 4 << 11 & 0x39E8);
                        var16.method3788(var16.method2102(true), var9, true, var12, var13, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILtga;)Z", line = 174)
    public final boolean method421(int arg0, class63 arg1) {
        if (arg0 != 511) {
            this.method416(null, false);
        }
        field761++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field763 == arg1.field763 && this.field760.equals(arg1.field760);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(III)Lmea;", line = 202)
    public static final class451 method422(int arg0, int arg1, int arg2) {
        if (arg1 != 17492) {
            return null;
        }
        field764++;
        class451 var3 = class166.method1238((byte) -45, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field6270 == null || var3.field6270.length <= arg0) {
            return null;
        } else {
            return var3.field6270[arg0];
        }
    }
}
