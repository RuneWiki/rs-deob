import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class734 extends class555 {
   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10734 = new String[]{method5329(method5328("=^68eb")), method5329(method5328("=^68ib")), method5329(method5328("=^68lb")), method5329(method5328("=^68ob")), method5329(method5328("=^68kb")), method5329(method5328("=^68nb")), method5329(method5328("=^68hb")), method5329(method5328("=^68jb")), method5329(method5328("=^68db"))};
   @OriginalMember(
      owner = "client!waa",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10725 = new String[100];
   @OriginalMember(
      owner = "client!waa",
      name = "l",
      descriptor = "Ldd;"
   )
   public static class735 field10731 = new class735(12, 0, 1, 0);
   @OriginalMember(
      owner = "client!waa",
      name = "n",
      descriptor = "I"
   )
   public static int field10724;
   @OriginalMember(
      owner = "client!waa",
      name = "o",
      descriptor = "I"
   )
   public static int field10726;
   @OriginalMember(
      owner = "client!waa",
      name = "j",
      descriptor = "I"
   )
   public static int field10727;
   @OriginalMember(
      owner = "client!waa",
      name = "g",
      descriptor = "I"
   )
   public static int field10728;
   @OriginalMember(
      owner = "client!waa",
      name = "m",
      descriptor = "I"
   )
   public static int field10729;
   @OriginalMember(
      owner = "client!waa",
      name = "i",
      descriptor = "I"
   )
   public static int field10730;
   @OriginalMember(
      owner = "client!waa",
      name = "f",
      descriptor = "I"
   )
   public static int field10732;
   @OriginalMember(
      owner = "client!waa",
      name = "k",
      descriptor = "I"
   )
   public static int field10733;

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field10732;
         if (arg1 <= 36) {
            field10725 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10734[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(IBZ)Ljava/lang/String;"
   )
   public static final String method5323(int arg0, byte arg1, boolean arg2) {
      try {
         int var3 = -60 % ((34 - arg1) / 36);
         ++field10724;
         return arg2 && arg0 >= 0 ? class198.method1488(10, arg2, -1, arg0) : Integer.toString(arg0);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10734[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method5324(byte arg0) {
      try {
         if (arg0 >= -61) {
            field10731 = null;
         }

         ++field10733;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10734[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class734(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!waa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5325(int arg0) {
      try {
         field10731 = null;
         if (arg0 > 17) {
            field10725 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10734[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            return 36;
         } else {
            ++field10727;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10734[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(B)Z"
   )
   public static final boolean method5326(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field10730;

         try {
            if (class449.field6210 == 2) {
               if (class59.field619 == null) {
                  class59.field619 = class151.method1256(class188.field2305, class370.field5220, class104.field1328);
                  if (class59.field619 == null) {
                     return false;
                  }
               }

               if (class700.field10203 == null) {
                  class700.field10203 = new class234(class191.field2315, class302.field4011);
               }

               class69 var2 = class131.field1647;
               if (class728.field10669 != null) {
                  var2 = class728.field10669;
               }

               if (var2.method655(class700.field10203, 22050, -1, class439.field6075, class59.field619)) {
                  class131.field1647 = var2;
                  class131.field1647.method663((byte)-96);
                  class69 var10000;
                  int var3;
                  if (~class693.field10121 < -1) {
                     class449.field6210 = 3;
                     class131.field1647.method647(-118, ~class693.field10121 >= ~class671.field9870 ? class693.field10121 : class671.field9870);
                     var3 = 0;
                     if (var1) {
                        class131.field1647.method682(var3, true, class420.field5891[var3]);
                        class420.field5891[var3] = 255;
                        ++var3;
                     }

                     while(true) {
                        while(var3 < class420.field5891.length) {
                           class131.field1647.method682(var3, true, class420.field5891[var3]);
                           class420.field5891[var3] = 255;
                           ++var3;
                        }

                        if (!var1) {
                           if (var1) {
                              class449.field6210 = 0;
                              class131.field1647.method647(-125, class671.field9870);
                              var3 = 0;
                              if (var1) {
                                 class131.field1647.method682(var3, true, class420.field5891[var3]);
                                 class420.field5891[var3] = 255;
                                 ++var3;
                              }
                           } else {
                              var10000 = class728.field10669;
                              if (!var1) {
                                 if (var10000 == null) {
                                    label170: {
                                       if (~class700.field10201 >= -1L) {
                                          class131.field1647.method665(2, class59.field619, class382.field5353);
                                          if (!var1) {
                                             break label170;
                                          }
                                       }

                                       class131.field1647.method681(class382.field5353, class59.field619, class700.field10201, -122, true);
                                    }
                                 }

                                 if (class69.field796 != null) {
                                    class69.field796.method61(33, class131.field1647);
                                 }

                                 class188.field2305 = null;
                                 class59.field619 = null;
                                 class700.field10203 = null;
                                 class728.field10669 = null;
                                 class700.field10201 = 0L;
                                 return true;
                              }

                              var10000.method682(var3, true, class420.field5891[var3]);
                              class420.field5891[var3] = 255;
                              ++var3;
                           }
                           break;
                        }

                        ++var3;
                     }
                  } else {
                     class449.field6210 = 0;
                     class131.field1647.method647(-125, class671.field9870);
                     var3 = 0;
                     if (var1) {
                        class131.field1647.method682(var3, true, class420.field5891[var3]);
                        class420.field5891[var3] = 255;
                        ++var3;
                     }
                  }

                  while(true) {
                     while(class420.field5891.length > var3) {
                        class131.field1647.method682(var3, true, class420.field5891[var3]);
                        class420.field5891[var3] = 255;
                        ++var3;
                     }

                     var10000 = class728.field10669;
                     if (!var1) {
                        if (var10000 == null) {
                           label171: {
                              if (~class700.field10201 >= -1L) {
                                 class131.field1647.method665(2, class59.field619, class382.field5353);
                                 if (!var1) {
                                    break label171;
                                 }
                              }

                              class131.field1647.method681(class382.field5353, class59.field619, class700.field10201, -122, true);
                           }
                        }

                        if (class69.field796 != null) {
                           class69.field796.method61(33, class131.field1647);
                        }

                        class188.field2305 = null;
                        class59.field619 = null;
                        class700.field10203 = null;
                        class728.field10669 = null;
                        class700.field10201 = 0L;
                        return true;
                     }

                     var10000.method682(var3, true, class420.field5891[var3]);
                     class420.field5891[var3] = 255;
                     ++var3;
                  }
               }
            }

            if (arg0 >= -83) {
               field10725 = null;
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class131.field1647.method657(22701);
            class728.field10669 = null;
            class449.field6210 = 0;
            class700.field10203 = null;
            class188.field2305 = null;
            class59.field619 = null;
         }

         return false;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10734[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 == -13712) {
            ++field10729;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10734[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class734(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = 18 / ((arg1 - 12) / 47);
         ++field10726;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10734[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(ZIBII)V"
   )
   public static final void method5327(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field10728;
         if (class603.method4400(2, arg4)) {
            if (arg2 > -105) {
               method5325(64);
            }

            class271.method2078(arg3, arg0, class468.field6451[arg4], -1, -15, arg1);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10734[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5328(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5329(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
