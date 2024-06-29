import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class110 {
   @OriginalMember(
      owner = "client!hk",
      name = "c",
      descriptor = "S"
   )
   public short field1801;
   @OriginalMember(
      owner = "client!hk",
      name = "h",
      descriptor = "B"
   )
   public byte field1802;
   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "Z"
   )
   public boolean field1800;
   @OriginalMember(
      owner = "client!hk",
      name = "e",
      descriptor = "I"
   )
   public int field1797;
   @OriginalMember(
      owner = "client!hk",
      name = "j",
      descriptor = "S"
   )
   public short field1799;
   @OriginalMember(
      owner = "client!hk",
      name = "f",
      descriptor = "I"
   )
   public int field1796;
   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "B"
   )
   public byte field1794;
   @OriginalMember(
      owner = "client!hk",
      name = "i",
      descriptor = "S"
   )
   public short field1793;
   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1803 = new String[]{method1051(method1050("ZY\u001bDt")), method1051(method1050("ZY\u001b:5\\[A8t")), method1051(method1050("ZY\u001bGt"))};
   @OriginalMember(
      owner = "client!hk",
      name = "d",
      descriptor = "I"
   )
   public static int field1798;
   @OriginalMember(
      owner = "client!hk",
      name = "g",
      descriptor = "Lhw;"
   )
   public static class141 field1795;

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method1048(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field1798;

         try {
            if (arg0 <= 36) {
               return false;
            }

            if (class203.field3034 == 2) {
               if (class535.field7789 == null) {
                  class535.field7789 = class92.method896(class710.field10318, class537.field7822, class167.field2626);
                  if (class535.field7789 == null) {
                     return false;
                  }
               }

               if (class436.field6297 == null) {
                  class436.field6297 = new class601(class753.field10848, class45.field1000);
               }

               class582 var2 = class657.field9595;
               if (class548.field7918 != null) {
                  var2 = class548.field7918;
               }

               if (var2.method4290(class535.field7789, class436.field6297, (byte)122, field1795, 22050)) {
                  class657.field9595 = var2;
                  class657.field9595.method4322(true);
                  class582 var10000;
                  int var3;
                  if (~class66.field1222 >= -1) {
                     class203.field3034 = 0;
                     class657.field9595.method4321(class435.field6292, (byte)113);
                     var3 = 0;
                     if (var1) {
                        class657.field9595.method4292(var3, (byte)-105, client.field4561[var3]);
                        client.field4561[var3] = 255;
                        ++var3;
                     }

                     while(true) {
                        while(var3 < client.field4561.length) {
                           class657.field9595.method4292(var3, (byte)-105, client.field4561[var3]);
                           client.field4561[var3] = 255;
                           ++var3;
                        }

                        if (!var1) {
                           if (var1) {
                              class203.field3034 = 3;
                              class657.field9595.method4321(~class66.field1222 >= ~class435.field6292 ? class66.field1222 : class435.field6292, (byte)112);
                              var3 = 0;
                              if (var1) {
                                 class657.field9595.method4292(var3, (byte)-56, client.field4561[var3]);
                                 client.field4561[var3] = 255;
                                 ++var3;
                              }
                           } else {
                              var10000 = class548.field7918;
                              if (!var1) {
                                 if (var10000 == null) {
                                    label178: {
                                       if (class582.field8407 <= 0L) {
                                          class657.field9595.method4300(class233.field3405, (byte)78, class535.field7789);
                                          if (!var1) {
                                             break label178;
                                          }
                                       }

                                       class657.field9595.method4309(class535.field7789, -15350, class582.field8407, true, class233.field3405);
                                    }
                                 }

                                 if (class654.field9505 != null) {
                                    class654.field9505.method1560(32, class657.field9595);
                                 }

                                 class548.field7918 = null;
                                 class436.field6297 = null;
                                 class710.field10318 = null;
                                 class535.field7789 = null;
                                 class582.field8407 = 0L;
                                 return true;
                              }

                              var10000.method4292(var3, (byte)-56, client.field4561[var3]);
                              client.field4561[var3] = 255;
                              ++var3;
                           }
                           break;
                        }

                        ++var3;
                     }
                  } else {
                     class203.field3034 = 3;
                     class657.field9595.method4321(~class66.field1222 >= ~class435.field6292 ? class66.field1222 : class435.field6292, (byte)112);
                     var3 = 0;
                     if (var1) {
                        class657.field9595.method4292(var3, (byte)-56, client.field4561[var3]);
                        client.field4561[var3] = 255;
                        ++var3;
                     }
                  }

                  while(true) {
                     while(~client.field4561.length < ~var3) {
                        class657.field9595.method4292(var3, (byte)-56, client.field4561[var3]);
                        client.field4561[var3] = 255;
                        ++var3;
                     }

                     var10000 = class548.field7918;
                     if (!var1) {
                        if (var10000 == null) {
                           label181: {
                              if (class582.field8407 <= 0L) {
                                 class657.field9595.method4300(class233.field3405, (byte)78, class535.field7789);
                                 if (!var1) {
                                    break label181;
                                 }
                              }

                              class657.field9595.method4309(class535.field7789, -15350, class582.field8407, true, class233.field3405);
                           }
                        }

                        if (class654.field9505 != null) {
                           class654.field9505.method1560(32, class657.field9595);
                        }

                        class548.field7918 = null;
                        class436.field6297 = null;
                        class710.field10318 = null;
                        class535.field7789 = null;
                        class582.field8407 = 0L;
                        return true;
                     }

                     var10000.method4292(var3, (byte)-56, client.field4561[var3]);
                     client.field4561[var3] = 255;
                     ++var3;
                  }
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class657.field9595.method4287(38);
            class535.field7789 = null;
            class710.field10318 = null;
            class436.field6297 = null;
            class548.field7918 = null;
            class203.field3034 = 0;
         }

         return false;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1803[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1049(boolean arg0) {
      try {
         field1795 = null;
         if (!arg0) {
            field1795 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1803[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field1801 = (short)arg4;
         this.field1802 = (byte)arg8;
         this.field1800 = arg9;
         this.field1797 = arg0;
         this.field1799 = (short)arg5;
         this.field1796 = arg10;
         this.field1794 = (byte)arg7;
         this.field1793 = (short)arg6;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field1803[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1050(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1051(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
