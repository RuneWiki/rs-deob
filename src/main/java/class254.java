import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class254 extends InputStream {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Z")
    public static boolean field4443 = false;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lp;")
    public static class280 field4444 = class18.method140((byte) -128, "Fermer");

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4450 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[Lde;")
    public static class108[] field4448;

    @OriginalMember(owner = "client!wa", name = "read", descriptor = "()I")
    public final int read() {
        field4447++;
        class159.method1130(30000L, 0);
        return -1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1708(byte arg0) {
        field4448 = null;
        if (arg0 != 69) {
            method1708((byte) 59);
        }
        field4444 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public static final void method1709() {
        class57.field916 = 0;
        label191: for (int var0 = 0; var0 < class237.field4120; var0++) {
            class33 var1 = class191.field3350[var0];
            if (class25.field495 != null) {
                for (int var2 = 0; var2 < class25.field495.length; var2++) {
                    if (class25.field495[var2] != -1000000 && (var1.field618 <= class25.field495[var2] || var1.field614 <= class25.field495[var2]) && (var1.field621 <= class204.field3540[var2] || var1.field608 <= class204.field3540[var2]) && (var1.field621 >= class61.field995[var2] || var1.field608 >= class61.field995[var2]) && (var1.field615 <= class33.field623[var2] || var1.field609 <= class33.field623[var2]) && (var1.field615 >= class23.field431[var2] || var1.field609 >= class23.field431[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field604 == 1) {
                int var3 = var1.field625 + class18.field324 - class15.field284;
                if (var3 >= 0 && var3 <= class18.field324 + class18.field324) {
                    int var4 = var1.field617 + class18.field324 - class277.field4811;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field602 + class18.field324 - class277.field4811;
                    if (var5 > class18.field324 + class18.field324) {
                        var5 = class18.field324 + class18.field324;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class55.field905[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class51.field841 - var1.field621;
                        if (var7 > 32) {
                            var1.field605 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field605 = 2;
                            var7 = -var7;
                        }
                        var1.field611 = (var1.field615 - class108.field1786 << 8) / var7;
                        var1.field613 = (var1.field609 - class108.field1786 << 8) / var7;
                        var1.field610 = (var1.field618 - class277.field4814 << 8) / var7;
                        var1.field622 = (var1.field614 - class277.field4814 << 8) / var7;
                        class132.field2355[class57.field916++] = var1;
                    }
                }
            } else if (var1.field604 == 2) {
                int var8 = var1.field617 + class18.field324 - class277.field4811;
                if (var8 >= 0 && var8 <= class18.field324 + class18.field324) {
                    int var9 = var1.field625 + class18.field324 - class15.field284;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field619 + class18.field324 - class15.field284;
                    if (var10 > class18.field324 + class18.field324) {
                        var10 = class18.field324 + class18.field324;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class55.field905[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class108.field1786 - var1.field615;
                        if (var12 > 32) {
                            var1.field605 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field605 = 4;
                            var12 = -var12;
                        }
                        var1.field620 = (var1.field621 - class51.field841 << 8) / var12;
                        var1.field606 = (var1.field608 - class51.field841 << 8) / var12;
                        var1.field610 = (var1.field618 - class277.field4814 << 8) / var12;
                        var1.field622 = (var1.field614 - class277.field4814 << 8) / var12;
                        class132.field2355[class57.field916++] = var1;
                    }
                }
            } else if (var1.field604 == 4) {
                int var13 = var1.field618 - class277.field4814;
                if (var13 > 128) {
                    int var14 = var1.field617 + class18.field324 - class277.field4811;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field602 + class18.field324 - class277.field4811;
                    if (var15 > class18.field324 + class18.field324) {
                        var15 = class18.field324 + class18.field324;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field625 + class18.field324 - class15.field284;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field619 + class18.field324 - class15.field284;
                        if (var17 > class18.field324 + class18.field324) {
                            var17 = class18.field324 + class18.field324;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class55.field905[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field605 = 5;
                            var1.field620 = (var1.field621 - class51.field841 << 8) / var13;
                            var1.field606 = (var1.field608 - class51.field841 << 8) / var13;
                            var1.field611 = (var1.field615 - class108.field1786 << 8) / var13;
                            var1.field613 = (var1.field609 - class108.field1786 << 8) / var13;
                            class132.field2355[class57.field916++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1710(int arg0, byte arg1, int arg2) {
        if (arg1 != 100) {
            field4443 = true;
        }
        field4445++;
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
    public static final boolean method1711(byte arg0, int arg1) {
        if (arg0 != -34) {
            field4444 = null;
        }
        field4446++;
        return ((arg1 & 0x225B1777) >> 29) != 0;
    }
}
