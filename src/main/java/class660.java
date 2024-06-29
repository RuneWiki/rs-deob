import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class660 implements class505 {
   @OriginalMember(
      owner = "client!gj",
      name = "j",
      descriptor = "Lcaa;"
   )
   private class317 field9566;
   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9570 = new String[]{method4744(method4743("P{(Nq")), method4744(method4743("P{(Hq")), method4744(method4743("P{(Lq")), method4744(method4743("Ydja")), method4744(method4743("P{(10Yxr3q")), method4744(method4743("L?(#$")), method4744(method4743("P{(Iq")), method4744(method4743("\u000b}r3")), method4744(method4743("\u000bvr3")), method4744(method4743("P{(Dq"))};
   @OriginalMember(
      owner = "client!gj",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field9562 = false;
   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "I"
   )
   public static int field9560 = -1;
   @OriginalMember(
      owner = "client!gj",
      name = "e",
      descriptor = "I"
   )
   public static int field9561;
   @OriginalMember(
      owner = "client!gj",
      name = "g",
      descriptor = "I"
   )
   public static int field9564;
   @OriginalMember(
      owner = "client!gj",
      name = "i",
      descriptor = "I"
   )
   public static int field9565;
   @OriginalMember(
      owner = "client!gj",
      name = "h",
      descriptor = "I"
   )
   public static int field9567;
   @OriginalMember(
      owner = "client!gj",
      name = "c",
      descriptor = "Lwba;"
   )
   public static class55 field9563;
   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field9569;
   @OriginalMember(
      owner = "client!gj",
      name = "d",
      descriptor = "[[Lhv;"
   )
   public static class544[][] field9568;

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ZI)V",
      line = 3
   )
   public final void method90(boolean arg0, int arg1) {
      try {
         if (arg0) {
            class786.field11439.method645(0, 0, class207.field2647, class411.field6305, this.field9566.field4536, 0);
         }

         int var3 = -115 / ((arg1 - -91) / 35);
         ++field9565;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9570[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "<init>",
      descriptor = "(Lcaa;)V",
      line = 25
   )
   public class660(class317 arg0) {
      try {
         this.field9566 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9570[4] + (arg0 != null ? field9570[5] : field9570[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "(I)V",
      line = 36
   )
   public static void method4740(int arg0) {
      try {
         field9563 = null;
         field9568 = null;
         if (arg0 > -110) {
            field9560 = 99;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9570[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(I)V",
      line = 50
   )
   public final void method165(int arg0) {
      try {
         ++field9564;
         if (arg0 != 25668) {
            method4741((byte)17, (String)null);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9570[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(Z)Z",
      line = 60
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field9561;
         if (arg0) {
            this.method90(false, 41);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9570[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;",
      line = 73
   )
   public static final String method4741(byte arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field9567;
         int var3 = -21 / ((arg0 - -5) / 41);
         int var4 = arg1.length();
         int var5 = 0;
         int var6 = 0;
         char var7;
         if (var2 != 0) {
            var7 = arg1.charAt(var6);
            if (~var7 != -61) {
               if (~var7 == -63) {
                  var5 += 3;
                  ++var6;
               } else {
                  ++var6;
               }
            } else {
               var5 += 3;
               ++var6;
            }
         }

         while(true) {
            char var10000;
            if (var6 >= var4) {
               StringBuffer var8 = new StringBuffer(var4 - -var5);
               var10000 = 0;
               if (var2 == 0) {
                  int var9 = 0;
                  String var13;
                  if (var2 != 0) {
                     var13 = arg1;
                  } else if (~var9 <= ~var4) {
                     var13 = var8.toString();
                     if (var2 == 0) {
                        return var13;
                     }
                  } else {
                     var13 = arg1;
                  }

                  while(true) {
                     char var10 = var13.charAt(var9);
                     if (var10 == '<') {
                        var8.append(field9570[7]);
                        if (var2 != 0) {
                           if (var10 != '>') {
                              var8.append(var10);
                              if (var2 != 0) {
                                 var8.append(field9570[8]);
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              var8.append(field9570[8]);
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else if (var10 != '>') {
                        var8.append(var10);
                        if (var2 != 0) {
                           var8.append(field9570[8]);
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        var8.append(field9570[8]);
                        ++var9;
                     }

                     if (~var9 <= ~var4) {
                        var13 = var8.toString();
                        if (var2 == 0) {
                           return var13;
                        }
                     } else {
                        var13 = arg1;
                     }
                  }
               }
            } else {
               var10000 = arg1.charAt(var6);
            }

            var7 = var10000;
            if (~var7 != -61) {
               if (~var7 == -63) {
                  var5 += 3;
                  ++var6;
               } else {
                  ++var6;
               }
            } else {
               var5 += 3;
               ++var6;
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field9570[6] + arg0 + ',' + (arg1 != null ? field9570[5] : field9570[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)Llu;",
      line = 122
   )
   public static final class741 method4742(int arg0, int arg1, int arg2, Class arg3) {
      class72 var4 = class353.field5360[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         for(class389 var5 = var4.field910; var5 != null; var5 = var5.field5942) {
            class741 var6 = var5.field5943;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10995 == arg1 && var6.field11000 == arg2) {
               return var6;
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4743(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4744(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
