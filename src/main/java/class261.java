import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class261 {

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "Lng;")
    private class226 field3850 = new class226(64);

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "Lng;")
    public class226 field3851 = new class226(50);

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Lng;")
    public class226 field3852 = new class226(5);

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "Lic;")
    private class491 field3848;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Z")
    public boolean field3840;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Lic;")
    public class491 field3842;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Lrb;")
    public static class234 field3839;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "[I")
    public static int[] field3841;

    static {
        new class475("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZZ)V", line = 9)
    public final void method1731(boolean arg0, boolean arg1) {
        field3847++;
        if (this.field3840 == arg0) {
            return;
        }
        this.field3840 = arg0;
        this.method1737((byte) -119);
        if (arg1) {
            this.method1736(106, 116);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 25)
    public final void method1732(int arg0) {
        int var2 = -40 % ((36 - arg0) / 54);
        field3843++;
        class226 var3 = this.field3851;
        synchronized (this.field3851) {
            this.field3851.method1540(0);
        }
        class226 var4 = this.field3852;
        synchronized (this.field3852) {
            this.field3852.method1540(0);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)Lva;", line = 40)
    public final class342 method1733(boolean arg0, int arg1) {
        field3846++;
        class226 var3 = this.field3850;
        class342 var4;
        synchronized (this.field3850) {
            var4 = (class342) this.field3850.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3848.method2945(class411.method2476(-115, arg1), class98.method604(204, arg1), arg0);
        if (!arg0) {
            return null;
        }
        class342 var6 = new class342();
        var6.field4917 = this;
        var6.field4936 = arg1;
        if (var5 != null) {
            var6.method2092(0, new class209(var5));
        }
        var6.method2090(-1221739249);
        class226 var7 = this.field3850;
        synchronized (this.field3850) {
            this.field3850.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "()V", line = 74)
    public static final void method1734() {
        if (class417.field6246 != null) {
            for (int var0 = 0; var0 < class417.field6246.length; var0++) {
                for (int var1 = 0; var1 < class361.field5554; var1++) {
                    for (int var2 = 0; var2 < class484.field7096; var2++) {
                        if (class417.field6246[var0][var1][var2] != null) {
                            class417.field6246[var0][var1][var2].method3048(100);
                        }
                        class417.field6246[var0][var1][var2] = null;
                    }
                }
            }
        }
        class417.field6246 = null;
        class307.field4415 = null;
        if (class508.field7423 != null) {
            for (int var3 = 0; var3 < class508.field7423.length; var3++) {
                for (int var4 = 0; var4 < class361.field5554; var4++) {
                    for (int var5 = 0; var5 < class484.field7096; var5++) {
                        if (class508.field7423[var3][var4][var5] != null) {
                            class508.field7423[var3][var4][var5].method3048(92);
                        }
                        class508.field7423[var3][var4][var5] = null;
                    }
                }
            }
        }
        class508.field7423 = null;
        class31.field335 = null;
        class108.field1553 = null;
        class86.field1324 = null;
        class56.field870 = 0;
        if (class210.field3063 != null) {
            for (int var6 = 0; var6 < class56.field870; var6++) {
                class210.field3063[var6] = null;
            }
        }
        if (class377.field5758 != null) {
            for (int var7 = 0; var7 < class526.field7784; var7++) {
                class377.field5758[var7] = null;
            }
            class526.field7784 = 0;
        }
        if (class517.field7540 != null) {
            for (int var8 = 0; var8 < class44.field711; var8++) {
                class517.field7540[var8] = null;
            }
            for (int var9 = 0; var9 < class208.field2979; var9++) {
                for (int var10 = 0; var10 < class361.field5554; var10++) {
                    for (int var11 = 0; var11 < class484.field7096; var11++) {
                        class9.field123[var9][var10][var11] = 0L;
                    }
                }
            }
            class44.field711 = 0;
        }
        class4.field58 = null;
        class474.method2837(true);
        class118.field1784.method1881(2);
        class180.field2647 = null;
        class200.field2889 = null;
        class339.field4778 = null;
        class42.field640 = null;
        class34.field354 = null;
        class271.field3941 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 219)
    public static void method1735(boolean arg0) {
        if (arg0) {
            field3841 = null;
        }
        field3839 = null;
        field3841 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 230)
    public final void method1736(int arg0, int arg1) {
        field3844++;
        class226 var3 = this.field3850;
        synchronized (this.field3850) {
            this.field3850.method1534(0, arg1);
        }
        class226 var4 = this.field3851;
        synchronized (this.field3851) {
            this.field3851.method1534(arg0, arg1);
        }
        class226 var5 = this.field3852;
        synchronized (this.field3852) {
            this.field3852.method1534(0, arg1);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 247)
    public final void method1737(byte arg0) {
        if (arg0 >= -116) {
            return;
        }
        field3845++;
        class226 var2 = this.field3850;
        synchronized (this.field3850) {
            this.field3850.method1540(0);
        }
        class226 var3 = this.field3851;
        synchronized (this.field3851) {
            this.field3851.method1540(0);
        }
        class226 var4 = this.field3852;
        synchronized (this.field3852) {
            this.field3852.method1540(0);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V", line = 268)
    public final void method1738(int arg0, int arg1) {
        field3837++;
        this.field3853 = arg0;
        class226 var3 = this.field3851;
        synchronized (this.field3851) {
            this.field3851.method1540(arg1 ^ arg1);
        }
        class226 var4 = this.field3852;
        synchronized (this.field3852) {
            this.field3852.method1540(0);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V", line = 290)
    public final void method1739(byte arg0) {
        class226 var2 = this.field3850;
        synchronized (this.field3850) {
            this.field3850.method1539(arg0 ^ 0xFFFFFFA8);
        }
        field3849++;
        class226 var3 = this.field3851;
        synchronized (this.field3851) {
            this.field3851.method1539(-88);
        }
        class226 var4 = this.field3852;
        synchronized (this.field3852) {
            this.field3852.method1539(-90);
            if (arg0 != 38) {
                this.field3848 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lai;IZLic;Lic;)V", line = 322)
    public class261(class423 arg0, int arg1, boolean arg2, class491 arg3, class491 arg4) {
        this.field3848 = arg3;
        this.field3840 = arg2;
        this.field3842 = arg4;
        if (this.field3848 != null) {
            int var6 = this.field3848.method2943((byte) -33) - 1;
            this.field3848.method2942(false, var6);
        }
    }
}
