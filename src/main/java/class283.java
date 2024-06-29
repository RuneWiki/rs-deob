import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class283 extends class259 {

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public int field4329 = 12800;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public int field4326 = 12800;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public int field4337 = 0;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "Z")
    public boolean field4340 = true;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public int field4338 = 0;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "I")
    public int field4347 = -1;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    public int field4341 = -1;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "Ljava/lang/String;")
    public String field4343;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "Ljava/lang/String;")
    public String field4342;

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "Lpj;")
    public class284 field4349;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field4330 = 0;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "[I")
    public static int[] field4334;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIII)[I")
    public final int[] method1872(byte arg0, int arg1, int arg2, int arg3) {
        field4348++;
        int var5 = -40 / ((arg0 - 25) / 44);
        for (class150 var6 = (class150) this.field4349.method1894((byte) -90); var6 != null; var6 = (class150) this.field4349.method1886(-8)) {
            if (var6.method1016(arg1, arg2, arg3, true)) {
                return var6.method1018(76, arg3, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)J")
    public static final long method1873(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        return var3 == null || var3.field3025 == null ? 0L : var3.field3025.field1110;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZ)[I")
    public final int[] method1874(int arg0, int arg1, boolean arg2) {
        field4328++;
        if (arg2) {
            return null;
        }
        for (class150 var4 = (class150) this.field4349.method1894((byte) -90); var4 != null; var4 = (class150) this.field4349.method1886(-84)) {
            if (var4.method1017(arg0, arg1, (byte) -115)) {
                return var4.method1018(107, arg0, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)[I")
    public final int[] method1875(byte arg0, int arg1, int arg2) {
        field4325++;
        if (arg0 >= -81) {
            return null;
        }
        for (class150 var4 = (class150) this.field4349.method1894((byte) -90); var4 != null; var4 = (class150) this.field4349.method1886(-101)) {
            if (var4.method1022(arg1, (byte) 107, arg2)) {
                return var4.method1019(arg2, -85, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)Z")
    public final boolean method1876(int arg0, int arg1, byte arg2) {
        field4333++;
        class150 var4 = (class150) this.field4349.method1894((byte) -90);
        if (arg2 != -68) {
            return false;
        }
        while (var4 != null) {
            if (var4.method1017(arg1, arg0, (byte) -117)) {
                return true;
            }
            var4 = (class150) this.field4349.method1886(-2);
        }
        return false;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public static void method1877(byte arg0) {
        field4334 = null;
        if (arg0 < 42) {
            field4330 = -63;
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(II)Ljava/lang/String;")
    public static final String method1878(int arg0, int arg1) {
        field4339++;
        if (arg0 != 671258456) {
            field4327 = -65;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF56) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            return;
        }
        if (arg4 >= arg0) {
            for (int var5 = arg0; var5 < arg4; var5++) {
                class241.field3751[var5][arg2] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg0; var6++) {
                class241.field3751[var6][arg2] = arg1;
            }
        }
        field4335++;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    public final void method1880(byte arg0) {
        this.field4326 = 12800;
        this.field4329 = 12800;
        field4346++;
        this.field4338 = 0;
        this.field4337 = 0;
        for (class150 var2 = (class150) this.field4349.method1894((byte) -90); var2 != null; var2 = (class150) this.field4349.method1886(-75)) {
            if (this.field4338 < var2.field2190) {
                this.field4338 = var2.field2190;
            }
            if (this.field4326 > var2.field2173) {
                this.field4326 = var2.field2173;
            }
            if (this.field4329 > var2.field2181) {
                this.field4329 = var2.field2181;
            }
            if (this.field4337 < var2.field2182) {
                this.field4337 = var2.field2182;
            }
        }
        if (arg0 < 122) {
            this.method1874(122, 112, false);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class283(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4347 = arg4;
        this.field4343 = arg2;
        this.field4331 = arg0;
        this.field4340 = arg5;
        this.field4341 = arg6;
        if (this.field4341 == 255) {
            this.field4341 = 0;
        }
        this.field4342 = arg1;
        this.field4345 = arg3;
        this.field4349 = new class284();
    }
}
