import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class268 {

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Lng;")
    private class226 field3914 = new class226(64);

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public int field3920 = 0;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Lic;")
    private class491 field3917;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Lki;")
    public static class498 field3908 = new class498(73, 7);

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field3913 = 0;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1767(boolean arg0) {
        field3916++;
        class226 var2 = this.field3914;
        synchronized (this.field3914) {
            if (!arg0) {
                this.method1767(false);
            }
            this.field3914.method1540(0);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1768(int arg0) {
        class509.field7435.method1539(-71);
        field3915++;
        class478.field7022.method1539(-68);
        class352.field5399.method1539(-126);
        class111.field1591.method1539(-127);
        class500.field7360.method1539(-118);
        if (arg0 != -22096) {
            method1768(-53);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/lang/String;)V", line = 35)
    public static final void method1769(int arg0, String arg1) {
        int var2 = 12 / ((arg0 - 51) / 37);
        System.out.println("Error: " + class397.method2399(arg1, "%0a", 74, "\n"));
        field3919++;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V", line = 45)
    public static final void method1770(boolean arg0) {
        field3911++;
        if (!arg0 || class34.field357 == 0) {
            return;
        }
        try {
            if (++class251.field3731 > 1500) {
                if (class90.field1361 != null) {
                    class90.field1361.method2312(!arg0);
                    class90.field1361 = null;
                }
                if (class107.field1540 >= 1) {
                    class34.field357 = 0;
                    class80.field1217 = -5;
                    return;
                }
                class251.field3731 = 0;
                if (class484.field7104 == class323.field4625) {
                    class484.field7104 = class257.field3800;
                } else {
                    class484.field7104 = class323.field4625;
                }
                class34.field357 = 1;
                class107.field1540++;
            }
            if (class34.field357 == 1) {
                class166.field2450 = class483.field7077.method2598(class375.field5717, class484.field7104, (byte) 114);
                class34.field357 = 2;
            }
            if (class34.field357 == 2) {
                if (class166.field2450.field4032 == 2) {
                    throw new IOException();
                }
                if (class166.field2450.field4032 != 1) {
                    return;
                }
                class90.field1361 = new class376((Socket) class166.field2450.field4030, class483.field7077);
                class166.field2450 = null;
                class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, 4900, 0);
                class107.method664(128);
                int var1 = class90.field1361.method2306((byte) -119);
                class107.method664(128);
                if (var1 != 101) {
                    class80.field1217 = var1;
                    class34.field357 = 0;
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                    return;
                }
                class34.field357 = 3;
            }
            if (class34.field357 == 3 && class90.field1361.method2310(100) >= 2) {
                int var2 = class90.field1361.method2306((byte) 91) << 8 | class90.field1361.method2306((byte) 73);
                class307.method1937(var2, (byte) -93);
                if (class102.field1474 == -1) {
                    class80.field1217 = 6;
                    class34.field357 = 0;
                    class90.field1361.method2312(!arg0);
                    class90.field1361 = null;
                } else {
                    class34.field357 = 0;
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                    class104.method642(1);
                }
            }
        } catch (IOException var3) {
            if (class90.field1361 != null) {
                class90.field1361.method2312(!arg0);
                class90.field1361 = null;
            }
            if (class107.field1540 >= 1) {
                class34.field357 = 0;
                class80.field1217 = -4;
            } else {
                class251.field3731 = 0;
                if (class484.field7104 == class323.field4625) {
                    class484.field7104 = class257.field3800;
                } else {
                    class484.field7104 = class323.field4625;
                }
                class34.field357 = 1;
                class107.field1540++;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 189)
    public final void method1771(byte arg0) {
        class226 var2 = this.field3914;
        synchronized (this.field3914) {
            this.field3914.method1539(-109);
        }
        if (arg0 != 52) {
            method1773(-28);
        }
        field3912++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lwc;", line = 204)
    public final class47 method1772(int arg0, int arg1) {
        field3910++;
        class226 var3 = this.field3914;
        class47 var4;
        synchronized (this.field3914) {
            var4 = (class47) this.field3914.method1536((long) arg0, 0);
        }
        int var5 = 66 / ((arg1 - 56) / 40);
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field3917.method2945(4, arg0, true);
        class47 var7 = new class47();
        var7.field760 = arg0;
        var7.field757 = this;
        if (var6 != null) {
            var7.method295(new class209(var6), (byte) 89);
        }
        var7.method293(true);
        class226 var8 = this.field3914;
        synchronized (this.field3914) {
            this.field3914.method1542(var7, (byte) 112, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 235)
    public static void method1773(int arg0) {
        if (arg0 == 9447) {
            field3908 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V", line = 245)
    public final void method1774(byte arg0, int arg1) {
        field3909++;
        class226 var3 = this.field3914;
        synchronized (this.field3914) {
            this.field3914.method1534(0, arg1);
            int var4 = -54 % ((arg0 - 33) / 33);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lai;ILic;)V", line = 274)
    public class268(class423 arg0, int arg1, class491 arg2) {
        this.field3917 = arg2;
        this.field3918 = this.field3917.method2942(false, 4);
    }
}
