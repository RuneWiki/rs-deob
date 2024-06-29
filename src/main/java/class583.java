import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class583 {
   @OriginalMember(
      owner = "client!fi",
      name = "i",
      descriptor = "Loi;"
   )
   private class80 field8633 = new class80(64);
   @OriginalMember(
      owner = "client!fi",
      name = "d",
      descriptor = "Lkf;"
   )
   private class266 field8638;
   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "I"
   )
   public int field8634;
   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8643 = new String[]{method4257(method4256("$g}Hg")), method4257(method4256("$g}Ng")), method4257(method4256("$g}Og")), method4257(method4256("$g}6&,g'4g")), method4257(method4256(",{?f")), method4257(method4256("9 }$2")), method4257(method4256("7b")), method4257(method4256("7c")), method4257(method4256("$g}Kg"))};
   @OriginalMember(
      owner = "client!fi",
      name = "f",
      descriptor = "Loba;"
   )
   public static class274 field8635 = new class274();
   @OriginalMember(
      owner = "client!fi",
      name = "j",
      descriptor = "Leg;"
   )
   public static class118 field8640 = new class118(139, 7);
   @OriginalMember(
      owner = "client!fi",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field8641 = new class536(79, 3);
   @OriginalMember(
      owner = "client!fi",
      name = "c",
      descriptor = "I"
   )
   public static int field8642 = 100;
   @OriginalMember(
      owner = "client!fi",
      name = "k",
      descriptor = "I"
   )
   public static int field8632;
   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "I"
   )
   public static int field8636;
   @OriginalMember(
      owner = "client!fi",
      name = "e",
      descriptor = "I"
   )
   public static int field8637;
   @OriginalMember(
      owner = "client!fi",
      name = "h",
      descriptor = "I"
   )
   public static int field8639;

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IB)Loda;"
   )
   public final class129 method4251(int arg0, byte arg1) {
      try {
         ++field8632;
         class80 var3 = this.field8633;
         class129 var4;
         synchronized(this.field8633) {
            var4 = (class129)this.field8633.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg1 > -70) {
               this.field8634 = -49;
            }

            class266 var5 = this.field8638;
            byte[] var6;
            synchronized(this.field8638) {
               var6 = this.field8638.method2037(false, arg0, 19);
            }

            class129 var7 = new class129();
            if (var6 != null) {
               var7.method1023((byte)94, new class147(var6));
            }

            class80 var8 = this.field8633;
            synchronized(this.field8633) {
               this.field8633.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8643[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method4252(int arg0, int arg1, byte arg2) {
      try {
         int var3 = 109 % ((-5 - arg2) / 41);
         ++field8637;
         return ~(arg0 & 24) != -1 | (arg0 & 544) == 544;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8643[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4253(int arg0) {
      boolean var1 = client.field4360;

      try {
         int var2;
         int var3;
         int var7;
         label77: {
            ++field8636;
            class100.method839(arg0 + -1697555151, class300.field4107.field6429.method364(arg0 ^ -27));
            var2 = (class224.field3188 >> 12) - -(class672.field9740 >> 3);
            var3 = (class782.field11465 >> 12) + (class533.field7595 >> 3);
            class561.field8019 = class564.field8045.field10701 = 0;
            class564.field8045.method968(8, (byte)-116, 8);
            class436.field6245 = new int[arg0];
            class636.field9306 = new int[arg0][4];
            class78.field965 = new byte[arg0][];
            class474.field6824 = new int[arg0];
            class212.field3029 = new byte[arg0][];
            class77.field962 = new int[arg0];
            class464.field6705 = new int[arg0];
            class668.field9714 = new byte[arg0][];
            class371.field5388 = new byte[arg0][];
            class356.field4787 = new byte[arg0][];
            class769.field11340 = new int[arg0];
            class784.field11482 = new int[arg0];
            int var5 = 0;
            int var6 = (-(class644.field9403 >> 4) + var2) / 8;
            if (var1) {
               var7 = (-(class337.field4594 >> 4) + var3) / 8;
            } else if (var6 > ((class644.field9403 >> 4) + var2) / 8) {
               var7 = var5;
               if (!var1) {
                  break label77;
               }
            } else {
               var7 = (-(class337.field4594 >> 4) + var3) / 8;
            }

            while(true) {
               if (var1 || var7 <= ((class337.field4594 >> 4) + var3) / 8) {
                  do {
                     int var8 = (var6 << 8) + var7;
                     class436.field6245[var5] = var8;
                     class77.field962[var5] = class515.field7437.method2031(0, "m" + var6 + "_" + var7);
                     class474.field6824[var5] = class515.field7437.method2031(0, "l" + var6 + "_" + var7);
                     class464.field6705[var5] = class515.field7437.method2031(0, "n" + var6 + "_" + var7);
                     class784.field11482[var5] = class515.field7437.method2031(0, field8643[7] + var6 + "_" + var7);
                     class769.field11340[var5] = class515.field7437.method2031(arg0 + -18, field8643[6] + var6 + "_" + var7);
                     if (~class464.field6705[var5] == 0) {
                        class77.field962[var5] = -1;
                        class474.field6824[var5] = -1;
                        class784.field11482[var5] = -1;
                        class769.field11340[var5] = -1;
                     }

                     ++var5;
                     ++var7;
                  } while(var7 <= ((class337.field4594 >> 4) + var3) / 8);
               }

               ++var6;
               if (var6 > ((class644.field9403 >> 4) + var2) / 8) {
                  var7 = var5;
                  if (!var1) {
                     break;
                  }
               } else {
                  var7 = (-(class337.field4594 >> 4) + var3) / 8;
               }
            }
         }

         if (var1) {
            class464.field6705[var7] = -1;
            class77.field962[var7] = -1;
            class474.field6824[var7] = -1;
            class784.field11482[var7] = -1;
            class769.field11340[var7] = -1;
            ++var7;
         }

         while(true) {
            while(~var7 > ~class464.field6705.length) {
               class464.field6705[var7] = -1;
               class77.field962[var7] = -1;
               class474.field6824[var7] = -1;
               class784.field11482[var7] = -1;
               class769.field11340[var7] = -1;
               ++var7;
            }

            if (!var1) {
               byte var9;
               if (~class622.field9156 != -4) {
                  label105: {
                     if (~class622.field9156 == -10) {
                        var9 = 10;
                        if (!var1) {
                           break label105;
                        }
                     }

                     if (class622.field9156 != 7) {
                        throw new RuntimeException("");
                     }

                     var9 = 8;
                     if (var1) {
                        throw new RuntimeException("");
                     }
                  }
               } else {
                  var9 = 4;
               }

               class564.method4023(false, -1574872860, var9, var2, var3);
               return;
            }

            ++var7;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8643[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4254(int arg0) {
      try {
         field8641 = null;
         field8635 = null;
         int var1 = -126 % ((26 - arg0) / 47);
         field8640 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8643[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method4255(int arg0, int arg1) {
      return class559.field8009 != null ? class559.field8009[arg0][arg1] & 255 : 0;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class583(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field8638 = arg2;
         this.field8634 = this.field8638.method2060(2, 19);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8643[3] + (arg0 != null ? field8643[5] : field8643[4]) + ',' + arg1 + ',' + (arg2 != null ? field8643[5] : field8643[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
