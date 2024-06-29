import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class33 extends class36 {

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Z")
    public static boolean field391 = false;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "Ljava/lang/String;")
    public static String field396 = "Please remove ";

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field392 = new String[100];

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field399 = -1;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V", line = 8)
    public static final void method185(int arg0) {
        field393++;
        if (arg0 >= -16) {
            field391 = true;
        }
        if (class92.field1271) {
            return;
        }
        class92.field1271 = true;
        class125.field1711 = true;
        if (class98.field1340) {
            class89.field1257 = (float) ((int) class89.field1257 - 65 & 0xFFFFFF80);
        } else {
            class312.field4717 += (-24.0F - class312.field4717) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 33)
    public static void method186(int arg0) {
        field396 = null;
        field392 = null;
        int var1 = -105 % ((arg0 - 16) / 60);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILin;I)V", line = 48)
    public static final void method187(int arg0, int arg1, class344 arg2, int arg3) {
        if (arg2.field5250 == 0) {
            arg2.field5315 = arg2.field5287;
        } else if (arg2.field5250 == 1) {
            arg2.field5315 = (arg1 - arg2.field5293) / 2 + arg2.field5287;
        } else if (arg2.field5250 == 2) {
            arg2.field5315 = arg1 - arg2.field5293 - arg2.field5287;
        } else if (arg2.field5250 == 3) {
            arg2.field5315 = arg2.field5287 * arg1 >> 14;
        } else if (arg2.field5250 == 4) {
            arg2.field5315 = (arg2.field5287 * arg1 >> 14) + (arg1 - arg2.field5293) / 2;
        } else {
            arg2.field5315 = arg1 - (arg2.field5287 * arg1 >> 14) - arg2.field5293;
        }
        field390++;
        if (arg2.field5254 == 0) {
            arg2.field5183 = arg2.field5319;
        } else if (arg2.field5254 == 1) {
            arg2.field5183 = (arg3 - arg2.field5334) / 2 + arg2.field5319;
        } else if (arg2.field5254 == 2) {
            arg2.field5183 = arg3 - arg2.field5334 - arg2.field5319;
        } else if (arg2.field5254 == 3) {
            arg2.field5183 = arg2.field5319 * arg3 >> 14;
        } else if (arg2.field5254 == 4) {
            arg2.field5183 = (arg2.field5319 * arg3 >> 14) + (arg3 - arg2.field5334) / 2;
        } else {
            arg2.field5183 = arg3 - arg2.field5334 - (arg2.field5319 * arg3 >> 14);
        }
        if (arg0 != 222) {
            field398 = -32;
        }
        if (!class63.field823 || !(client.method821(arg2).field4426 != 0 || arg2.field5316 == 0)) {
            return;
        }
        if (arg2.field5315 < 0) {
            arg2.field5315 = 0;
        } else if (arg1 < (arg2.field5315 + arg2.field5293)) {
            arg2.field5315 = arg1 - arg2.field5293;
        }
        if (arg2.field5183 < 0) {
            arg2.field5183 = 0;
        } else if (arg3 < (arg2.field5334 + arg2.field5183)) {
            arg2.field5183 = arg3 - arg2.field5334;
        }
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Z", line = 129)
    public static final boolean method188(int arg0) {
        field394++;
        if (class278.field4179 == 0) {
            return arg0 == -128 ? class141.field1927.method566(118) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)V", line = 149)
    public static final void method189(int arg0) {
        if (arg0 < 4) {
            return;
        }
        int[] var1 = new int[class63.field824];
        field400++;
        int var2 = 0;
        for (int var3 = 0; var3 < class63.field824; var3++) {
            class198 var4 = class115.method854((byte) -63, var3);
            if (var4.field2809 >= 0 || var4.field2759 >= 0) {
                var1[var2++] = var3;
            }
        }
        class217.field3099 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class217.field3099[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
    public abstract boolean method184(int arg0);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method190(byte arg0);
}
