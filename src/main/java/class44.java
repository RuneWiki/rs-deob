import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class145 {

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Lfc;")
    public static class39 field1188 = class90.method774("<col=ffffff> )4 ", -125);

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lfc;")
    public static class39 field1198 = class90.method774("null", -105);

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field1212 = 127;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Lfc;")
    private static class39 field1210 = class90.method774(" from your ignore list first", -85);

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "Lfc;")
    public static class39 field1194 = field1210;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Loc;")
    public static class100 field1205;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[I")
    public int[] field1191;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "[I")
    public int[] field1192;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
    public int[] field1196;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "[Lle;")
    public class81[] field1193;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "[Lle;")
    public class81[] field1209;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[[[B")
    public byte[][][] field1190;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "[[[B")
    public static byte[][][] field1199;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 8)
    public static void method513(int arg0) {
        if (arg0 != 30212) {
            method513(117);
        }
        field1205 = null;
        field1188 = null;
        field1194 = null;
        field1199 = null;
        field1198 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V", line = 23)
    public static final void method514(int arg0, boolean arg1) {
        field1214++;
        if (class83.field1850.field3356 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 != 4) {
            method518((byte) 79);
        }
        while (var2 < 50 && class83.field1850.field3356.peekEvent() != null) {
            class61.method609(arg0 ^ 0xFFFFFFA6, 1L);
            var2++;
        }
        if (arg1) {
            class83.field1850.field3356.postEvent(new ActionEvent(class140.field3523, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lob;B)Z", line = 63)
    public static final boolean method515(class99 arg0, byte arg1) {
        if (arg1 != -119) {
            method513(-45);
        }
        field1201++;
        if (class38.field1026) {
            if (class89.method768(arg0, -44) != 0) {
                return false;
            }
            if (arg0.field2452 == 0) {
                return false;
            }
        }
        return arg0.field2385;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lof;B)V", line = 88)
    public static final void method516(class103 arg0, byte arg1) {
        field1202++;
        if (class13.field343 == 1) {
            short var2 = 280;
            if (class34.field889 >= var2 && class34.field889 <= var2 + 14 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(0, (byte) -21, 0);
                return;
            }
            if (class34.field889 >= var2 + 15 && var2 + 80 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(0, (byte) -21, 1);
                return;
            }
            short var3 = 390;
            if (class34.field889 >= var3 && var3 + 14 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(1, (byte) -21, 0);
                return;
            }
            if (var3 + 15 <= class34.field889 && var3 + 80 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(1, (byte) -21, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class34.field889 && var4 + 14 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(2, (byte) -21, 0);
                return;
            }
            if (class34.field889 >= var4 + 15 && var4 + 80 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(2, (byte) -21, 1);
                return;
            }
            short var5 = 610;
            if (var5 <= class34.field889 && var5 + 14 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(3, (byte) -21, 0);
                return;
            }
            if (var5 + 15 <= class34.field889 && var5 + 80 >= class34.field889 && class26.field758 >= 4 && class26.field758 <= 18) {
                class58.method587(3, (byte) -21, 1);
                return;
            }
            if (class34.field889 >= 708 && class26.field758 >= 4 && class34.field889 <= 758 && class26.field758 <= 20) {
                class108.field2718 = false;
                class66.field1573.method119(0, 0);
                class113.field2960.method119(382, 0);
                class88.field2062.method1155(382 - class88.field2062.field3543 / 2, 18);
                return;
            }
            if (class24.field675 != -1) {
                class13 var6 = class142.field3560[class24.field675];
                if (class26.field743 == var6.field335) {
                    byte[] var7 = class137.method1111(new class39[] { var6.field337, class76.field1739 }, (byte) -126).method477(23242);
                    class60.field1456 = new String(var7, 0, var7.length);
                    if (class36.field980 != 0) {
                        class117.field3078 = 43594;
                        class80.field1812 = 43594;
                        class36.field980 = 0;
                        class63.field1543 = 443;
                    }
                    class108.field2718 = false;
                    class56.field1404 = var6.field336;
                    class66.field1573.method119(0, 0);
                    class113.field2960.method119(382, 0);
                    class88.field2062.method1155(382 - class88.field2062.field3543 / 2, 18);
                    return;
                }
                class39 var8 = class137.method1111(new class39[] { class132.field3347, var6.field337, class76.field1739, class107.field2684, class93.field2176, class86.method734(class74.field1705 ? 1 : 0, 2218), class2.field47, class86.method734(class93.field2173, 2218), class131.field3320, class86.method734(class63.field1556, 2218) }, (byte) 75);
                try {
                    arg0.getAppletContext().showDocument(var8.method441(12340), "_self");
                } catch (Exception var10) {
                }
            }
        }
        int var9 = -118 / ((-arg1 - 18) / 34);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 211)
    public static final void method517(int arg0) {
        class140.field3540.method927(false);
        if (arg0 != 3) {
            method516(null, (byte) 28);
        }
        field1213++;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 233)
    public static final void method518(byte arg0) {
        if (arg0 <= -123) {
            field1211++;
            class143.field3592.method927(false);
            class27.field767.method927(false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V", line = 254)
    public static final void method519(int arg0) {
        field1203++;
        if (arg0 > -121) {
            field1195 = -10;
        }
        for (int var1 = 0; var1 < class68.field1626; var1++) {
            int var2 = class98.field2328[var1];
            class142 var3 = class101.field2525[var2];
            int var4 = class39.field1065.method322((byte) -50);
            if ((var4 & 0x80) != 0) {
                var4 += class39.field1065.method322((byte) -50) << 8;
            }
            class104.method930(var3, (byte) -93, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V", line = 304)
    public static final void method520(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        if (arg0 != -19) {
            method519(99);
        }
        System.exit(1);
        field1204++;
    }
}
