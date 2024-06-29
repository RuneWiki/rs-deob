import java.applet.Applet;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class126 extends class546 {
   @OriginalMember(
      owner = "client!uaa",
      name = "H",
      descriptor = "I"
   )
   public int field1570 = 0;
   @OriginalMember(
      owner = "client!uaa",
      name = "w",
      descriptor = "I"
   )
   public int field1581 = -1;
   @OriginalMember(
      owner = "client!uaa",
      name = "R",
      descriptor = "I"
   )
   public int field1583 = 0;
   @OriginalMember(
      owner = "client!uaa",
      name = "M",
      descriptor = "I"
   )
   public int field1579 = -1;
   @OriginalMember(
      owner = "client!uaa",
      name = "P",
      descriptor = "I"
   )
   public int field1584 = 12800;
   @OriginalMember(
      owner = "client!uaa",
      name = "J",
      descriptor = "Z"
   )
   public boolean field1574 = true;
   @OriginalMember(
      owner = "client!uaa",
      name = "A",
      descriptor = "I"
   )
   public int field1590 = 12800;
   @OriginalMember(
      owner = "client!uaa",
      name = "K",
      descriptor = "I"
   )
   public int field1578;
   @OriginalMember(
      owner = "client!uaa",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public String field1580;
   @OriginalMember(
      owner = "client!uaa",
      name = "I",
      descriptor = "Ljava/lang/String;"
   )
   public String field1576;
   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "I"
   )
   public int field1569;
   @OriginalMember(
      owner = "client!uaa",
      name = "G",
      descriptor = "Lod;"
   )
   public class536 field1577;
   @OriginalMember(
      owner = "client!uaa",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1592 = new String[]{method1062(method1061("\u001eLb\r\u0000C")), method1062(method1061("\u001eLb\r\u0006C")), method1062(method1061("\u0005XoO")), method1062(method1061("\u001eLb\r\u0005C")), method1062(method1061("\u0010\u0003-\r>")), method1062(method1061("\u001eLb\r\u0001C")), method1062(method1061("\u001eLb\r\u0002C")), method1062(method1061("\u001eLb\r\u0004C")), method1062(method1061("\u001eLb\r\u000bC")), method1062(method1061("\u001eLb\r\u007f\u0002CjW}C")), method1062(method1061("\u001eLb\r\u0007C"))};
   @OriginalMember(
      owner = "client!uaa",
      name = "F",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field1568 = new BigInteger(method1062(method1061("Z\u001d3\u0013r")), 16);
   @OriginalMember(
      owner = "client!uaa",
      name = "O",
      descriptor = "Lbga;"
   )
   public static class378 field1585 = new class378(135, 6);
   @OriginalMember(
      owner = "client!uaa",
      name = "C",
      descriptor = "I"
   )
   public static int field1587 = 0;
   @OriginalMember(
      owner = "client!uaa",
      name = "u",
      descriptor = "Lbga;"
   )
   public static class378 field1591 = new class378(22, -1);
   @OriginalMember(
      owner = "client!uaa",
      name = "L",
      descriptor = "I"
   )
   public static int field1567;
   @OriginalMember(
      owner = "client!uaa",
      name = "t",
      descriptor = "I"
   )
   public static int field1571;
   @OriginalMember(
      owner = "client!uaa",
      name = "Q",
      descriptor = "I"
   )
   public static int field1573;
   @OriginalMember(
      owner = "client!uaa",
      name = "N",
      descriptor = "I"
   )
   public static int field1575;
   @OriginalMember(
      owner = "client!uaa",
      name = "D",
      descriptor = "I"
   )
   public static int field1582;
   @OriginalMember(
      owner = "client!uaa",
      name = "B",
      descriptor = "I"
   )
   public static int field1588;
   @OriginalMember(
      owner = "client!uaa",
      name = "y",
      descriptor = "I"
   )
   public static int field1589;
   @OriginalMember(
      owner = "client!uaa",
      name = "x",
      descriptor = "Lkh;"
   )
   public static class17 field1572;
   @OriginalMember(
      owner = "client!uaa",
      name = "E",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field1586;

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(I[III)Z"
   )
   public final boolean method1053(int arg0, int[] arg1, int arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field1588;
         if (arg3 != -23237) {
            return false;
         } else {
            class626 var6 = (class626)this.field1577.method3855(-84);
            boolean var10000;
            if (var5) {
               var10000 = var6.method4553(arg2, 110, arg0);
            } else if (var6 == null) {
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               var10000 = var6.method4553(arg2, 110, arg0);
            }

            while(!var10000) {
               var6 = (class626)this.field1577.method3866((byte)124);
               if (var6 == null) {
                  var10000 = false;
                  if (!var5) {
                     return false;
                  }
               } else {
                  var10000 = var6.method4553(arg2, 110, arg0);
               }
            }

            var6.method4551(arg2, arg0, (byte)-122, arg1);
            return true;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1592[3] + arg0 + ',' + (arg1 != null ? field1592[4] : field1592[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(Lvi;B)V"
   )
   public static final void method1054(class569 arg0, byte arg1) {
      try {
         if (arg1 != 124) {
            method1060(-55);
         }

         label42: {
            if (arg0 instanceof class680) {
               class680 var2 = (class680)arg0;
               if (var2.field9989 == null) {
                  break label42;
               }

               class563.method4046(var2, (byte)-99, ~class278.field3709.field1001 != ~var2.field1001);
               if (!client.field4273) {
                  break label42;
               }
            }

            if (arg0 instanceof class404) {
               class404 var3 = (class404)arg0;
               class325.method2451(-127, ~class278.field3709.field1001 != ~var3.field1001, var3);
            }
         }

         ++field1575;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1592[8] + (arg0 != null ? field1592[4] : field1592[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(BII)Z"
   )
   public final boolean method1055(byte arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field1571;
         class626 var5 = (class626)this.field1577.method3855(125);
         if (var4) {
            if (var5.method4553(arg2, 110, arg1)) {
               return true;
            }

            var5 = (class626)this.field1577.method3866((byte)117);
         }

         while(true) {
            boolean var10000;
            if (var5 == null) {
               int var6 = 118 % ((arg0 - -56) / 56);
               var10000 = false;
               if (!var4) {
                  return false;
               }
            } else {
               var10000 = var5.method4553(arg2, 110, arg1);
            }

            if (var10000) {
               return true;
            }

            var5 = (class626)this.field1577.method3866((byte)117);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1592[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1056(byte arg0) {
      try {
         field1572 = null;
         field1591 = null;
         field1568 = null;
         field1586 = null;
         if (arg0 <= 13) {
            field1591 = null;
         }

         field1585 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1592[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(II[IBI)Z"
   )
   public final boolean method1057(int arg0, int arg1, int[] arg2, byte arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         ++field1582;
         if (arg3 > -45) {
            field1568 = null;
         }

         class626 var7 = (class626)this.field1577.method3855(118);
         boolean var10000;
         if (var6) {
            var10000 = var7.method4552(arg4, arg0, arg1, false);
         } else if (var7 == null) {
            var10000 = false;
            if (!var6) {
               return false;
            }
         } else {
            var10000 = var7.method4552(arg4, arg0, arg1, false);
         }

         while(!var10000) {
            var7 = (class626)this.field1577.method3866((byte)111);
            if (var7 == null) {
               var10000 = false;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = var7.method4552(arg4, arg0, arg1, false);
            }
         }

         var7.method4551(arg4, arg0, (byte)-122, arg2);
         return true;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1592[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1592[4] : field1592[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1058(byte arg0) {
      boolean var2 = client.field4273;

      try {
         this.field1584 = 12800;
         ++field1567;
         this.field1570 = 0;
         this.field1590 = 12800;
         this.field1583 = 0;
         class626 var3 = (class626)this.field1577.method3855(127);
         int var10000;
         int var10001;
         if (var2) {
            var10000 = ~this.field1570;
            var10001 = ~var3.field8753;
         } else if (var3 == null) {
            var10000 = arg0;
            var10001 = 49;
            if (!var2) {
               if (arg0 != 49) {
                  this.field1577 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = ~this.field1570;
            var10001 = ~var3.field8753;
         }

         while(true) {
            if (var10000 > var10001) {
               this.field1570 = var3.field8753;
            }

            if (~var3.field8747 > ~this.field1590) {
               this.field1590 = var3.field8747;
            }

            if (var3.field8746 < this.field1584) {
               this.field1584 = var3.field8746;
            }

            if (var3.field8757 > this.field1583) {
               this.field1583 = var3.field8757;
            }

            var3 = (class626)this.field1577.method3866((byte)126);
            if (var3 == null) {
               var10000 = arg0;
               var10001 = 49;
               if (!var2) {
                  if (arg0 != 49) {
                     this.field1577 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = ~this.field1570;
               var10001 = ~var3.field8753;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1592[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(II[II)Z"
   )
   public final boolean method1059(int arg0, int arg1, int[] arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field1589;
         class626 var6 = (class626)this.field1577.method3855(121);
         if (var5) {
            if (var6.method4554(arg0, arg1, true)) {
               var6.method4550(arg1, arg0, arg2, (byte)-95);
               return true;
            }

            var6 = (class626)this.field1577.method3866((byte)117);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = arg3;
               if (!var5) {
                  if (arg3 != -19306) {
                     this.field1579 = 71;
                  }

                  return false;
               }
            } else {
               var10000 = var6.method4554(arg0, arg1, true);
            }

            if (var10000 != 0) {
               var6.method4550(arg1, arg0, arg2, (byte)-95);
               return true;
            }

            var6 = (class626)this.field1577.method3866((byte)117);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1592[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1592[4] : field1592[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(I)Lnaa;"
   )
   public static final class78 method1060(int arg0) {
      try {
         class635.field8978 = 0;
         ++field1573;
         if (arg0 < 118) {
            method1056((byte)-44);
         }

         return class302.method2274(-100);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1592[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "<init>",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V"
   )
   public class126(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         this.field1578 = arg3;
         this.field1581 = arg4;
         this.field1574 = arg5;
         this.field1580 = arg2;
         this.field1576 = arg1;
         this.field1579 = arg6;
         this.field1569 = arg0;
         if (this.field1579 == 255) {
            this.field1579 = 0;
         }

         this.field1577 = new class536();
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1592[9] + arg0 + ',' + (arg1 != null ? field1592[4] : field1592[2]) + ',' + (arg2 != null ? field1592[4] : field1592[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1061(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1062(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
