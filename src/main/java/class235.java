import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class235 {

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lm;")
    private class48 field3855 = new class48();

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lol;")
    private class231 field3857;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
    public static int[] field3851 = new int[2048];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lwm;")
    public static class152 field3852 = class157.method1048("Chargement de la liste des serveurs", 102);

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lwm;")
    public static class152 field3850 = class157.method1048("<col=c0ff00>", 104);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)V", line = 6)
    public final void method1610(int arg0, long arg1) {
        class133 var4 = (class133) this.field3857.method1586(arg1, -106);
        field3854++;
        if (var4 != null) {
            var4.method1880(-25368);
            var4.method402(0);
            this.field3845++;
        }
        if (arg0 < 85) {
            this.field3859 = -6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1611(int arg0) {
        field3844++;
        for (int var1 = arg0; var1 < class157.field2514; var1++) {
            class107 var2 = class133.method849(var1, -64);
            if (var2 != null && var2.field1529 == 0) {
                class155.field2464[var1] = 0;
                class249.field4227[var1] = 0;
            }
        }
        class183.field2901 = new class231(16);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 57)
    public static void method1612(boolean arg0) {
        field3850 = null;
        if (arg0) {
            field3858 = -125;
        }
        field3852 = null;
        field3851 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 70)
    public final void method1613(int arg0) {
        field3856++;
        class133 var2 = (class133) this.field3855.method333((byte) 117);
        if (arg0 != -22696) {
            this.method1620(false, -1L);
        }
        while (var2 != null) {
            if (var2.method848(13063)) {
                var2.method1880(-25368);
                var2.method402(0);
                this.field3845++;
            }
            var2 = (class133) this.field3855.method329(-13985);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 100)
    public final void method1614(Object arg0, long arg1, byte arg2) {
        field3861++;
        this.method1610(108, arg1);
        if (this.field3845 == 0) {
            class133 var5 = (class133) this.field3855.method335(arg2 ^ 0xFFFFFFF8);
            var5.method1880(-25368);
            var5.method402(0);
        } else {
            this.field3845--;
        }
        class280 var6 = new class280(arg0);
        if (arg2 == 78) {
            this.field3857.method1593(arg1, var6, 27497);
            this.field3855.method334((byte) 119, var6);
            var6.field916 = 0L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Led;", line = 130)
    public static final class294 method1615(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        return var3 == null ? null : var3.field573;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 139)
    public static final void method1616(byte arg0) {
        int var1 = 0;
        field3848++;
        if (arg0 != -13) {
            method1616((byte) 59);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class17.method112(class287.field4857, var1, true, (byte) -117, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 187)
    public final void method1617(int arg0, int arg1) {
        if (class272.field4664 != null) {
            for (class133 var3 = (class133) this.field3855.method333((byte) 98); var3 != null; var3 = (class133) this.field3855.method329(arg1 - 14035)) {
                if (var3.method848(13063)) {
                    if (var3.method853(arg1 ^ 0x35) == null) {
                        var3.method1880(-25368);
                        var3.method402(0);
                        this.field3845++;
                    }
                } else if ((long) arg0 < ++var3.field916) {
                    class133 var4 = class272.field4664.method622(var3, 0);
                    this.field3857.method1593(var3.field4689, var4, 27497);
                    class241.method1642(var4, var3, 1920);
                    var3.method1880(-25368);
                    var3.method402(0);
                }
            }
        }
        if (arg1 != 50) {
            field3858 = -41;
        }
        field3853++;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I", line = 242)
    public final int method1618(int arg0) {
        int var2 = 0;
        field3849++;
        class133 var3 = (class133) this.field3855.method333((byte) 103);
        if (arg0 > -68) {
            this.method1610(53, -51L);
        }
        while (var3 != null) {
            if (!var3.method848(13063)) {
                var2++;
            }
            var3 = (class133) this.field3855.method329(-13985);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 278)
    public final void method1619(int arg0) {
        this.field3855.method332((byte) 116);
        if (arg0 == 11300) {
            field3847++;
            this.field3857.method1589(false);
            this.field3845 = this.field3859;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZJ)Ljava/lang/Object;", line = 292)
    public final Object method1620(boolean arg0, long arg1) {
        field3846++;
        class133 var4 = (class133) this.field3857.method1586(arg1, -117);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method853(126);
        if (var5 == null) {
            var4.method1880(-25368);
            var4.method402(0);
            this.field3845++;
            return null;
        }
        if (!arg0) {
            this.method1618(5);
        }
        if (var4.method848(13063)) {
            class280 var6 = new class280(var5);
            this.field3857.method1593(var4.field4689, var6, 27497);
            this.field3855.method334((byte) 123, var6);
            var6.field916 = 0L;
            var4.method1880(-25368);
            var4.method402(0);
        } else {
            this.field3855.method334((byte) 125, var4);
            var4.field916 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V", line = 346)
    public class235(int arg0) {
        this.field3859 = arg0;
        this.field3845 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3857 = new class231(var2);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 362)
    public static final void method1621(int arg0, int arg1) {
        class208.field3392 = -1;
        if (arg1 != -101) {
            field3850 = (class152) null;
        }
        class208.field3392 = -1;
        field3860++;
        if (arg0 == 37) {
            class213.field3484 = 3.0F;
        } else if (arg0 == 50) {
            class213.field3484 = 4.0F;
        } else if (arg0 == 75) {
            class213.field3484 = 6.0F;
        } else if (arg0 == 100) {
            class213.field3484 = 8.0F;
        } else if (arg0 == 200) {
            class213.field3484 = 16.0F;
        }
    }
}
