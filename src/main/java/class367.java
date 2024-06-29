import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class367 {
   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5177 = new String[]{method2839(method2838("r\u0012D[q=")), method2839(method2838("r\u0012D[v=")), method2839(method2838("r\u0012D[w="))};
   @OriginalMember(
      owner = "client!gha",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field5173 = new class378(72, 0);
   @OriginalMember(
      owner = "client!gha",
      name = "f",
      descriptor = "I"
   )
   public static int field5175 = -1;
   @OriginalMember(
      owner = "client!gha",
      name = "e",
      descriptor = "I"
   )
   public static int field5171;
   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "I"
   )
   public static int field5172;
   @OriginalMember(
      owner = "client!gha",
      name = "d",
      descriptor = "I"
   )
   public static int field5174;
   @OriginalMember(
      owner = "client!gha",
      name = "b",
      descriptor = "I"
   )
   public static int field5176;

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2834(int arg0, int arg1) {
      try {
         class226.field2841 = -1;
         ++field5172;
         class575.field7911 = -1;
         class791.field11574 = arg0;
         if (arg1 != 18914) {
            method2837((byte)-113, false);
         }

         class245.method1842(114);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5177[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(Lbt;Z)V"
   )
   public static final void method2835(class47 arg0, boolean arg1) {
      for(int var2 = arg0.field547; var2 <= arg0.field548; ++var2) {
         for(int var3 = arg0.field540; var3 <= arg0.field541; ++var3) {
            class225 var4 = class111.field1404[arg0.field1001][var2][var3];
            if (var4 != null) {
               class752 var5 = var4.field2821;
               class752 var6 = null;

               while(var5 != null) {
                  if (var5.field10922 == arg0) {
                     if (var6 != null) {
                        var6.field10923 = var5.field10923;
                     } else {
                        var4.field2821 = var5.field10923;
                     }

                     var5.method5428(500);
                     break;
                  }

                  var6 = var5;
                  var5 = var5.field10923;
               }
            }
         }
      }

      if (!arg1) {
         class726.method5282(arg0);
      }

   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2836(int arg0) {
      try {
         if (arg0 != -1) {
            field5175 = -56;
         }

         field5173 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5177[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method2837(byte arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field5171;
         class775 var3 = (class775)class30.field366.method3855(arg0 ^ 94);
         if (var2) {
            if (var3.field11262 != null) {
               class717.field10509.method2175(var3.field11262);
               var3.field11262 = null;
            }

            if (var3.field11267 != null) {
               class717.field10509.method2175(var3.field11267);
               var3.field11267 = null;
            }

            var3.method3609(88);
            var3 = (class775)class30.field366.method3866((byte)127);
         }

         while(true) {
            if (var3 == null) {
               if (!var2) {
                  if (arg1) {
                     class775 var4 = (class775)class358.field5094.method3855(125);
                     if (var2) {
                        if (var4.field11262 != null) {
                           class717.field10509.method2175(var4.field11262);
                           var4.field11262 = null;
                        }

                        var4.method3609(103);
                        var4 = (class775)class358.field5094.method3866((byte)114);
                     }

                     while(true) {
                        while(var4 != null) {
                           if (var4.field11262 != null) {
                              class717.field10509.method2175(var4.field11262);
                              var4.field11262 = null;
                           }

                           var4.method3609(103);
                           var4 = (class775)class358.field5094.method3866((byte)114);
                        }

                        class775 var5 = (class775)class128.field1610.method1850(0);
                        if (!var2) {
                           if (var2 || var5 != null) {
                              do {
                                 if (var5.field11262 != null) {
                                    class717.field10509.method2175(var5.field11262);
                                    var5.field11262 = null;
                                 }

                                 var5.method3609(92);
                                 var5 = (class775)class128.field1610.method1847(122);
                              } while(var5 != null);
                           }
                           break;
                        }

                        var4 = (class775)class358.field5094.method3866((byte)114);
                     }
                  }

                  if (arg0 != 47) {
                     method2836(73);
                     return;
                  }

                  return;
               }
            } else if (var3.field11262 != null) {
               class717.field10509.method2175(var3.field11262);
               var3.field11262 = null;
            }

            if (var3.field11267 != null) {
               class717.field10509.method2175(var3.field11267);
               var3.field11267 = null;
            }

            var3.method3609(88);
            var3 = (class775)class30.field366.method3866((byte)127);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5177[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2838(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2839(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
