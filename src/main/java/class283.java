import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class283 extends class486 implements class142 {
   @OriginalMember(
      owner = "client!kv",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3776 = new String[]{method2159(method2158("\"2m\u0003 ")), method2159(method2158("2jmou")), method2159(method2158("'1/-")), method2159(method2158("\"2m\u0005 ")), method2159(method2158("\"2m\u0002 ")), method2159(method2158("\"2m}a'-7\u007f ")), method2159(method2158("\"2m\u0000 "))};
   @OriginalMember(
      owner = "client!kv",
      name = "A",
      descriptor = "Lafa;"
   )
   public static class365 field3774 = new class365(0, 1);
   @OriginalMember(
      owner = "client!kv",
      name = "C",
      descriptor = "I"
   )
   public static int field3771;
   @OriginalMember(
      owner = "client!kv",
      name = "B",
      descriptor = "I"
   )
   public static int field3772;
   @OriginalMember(
      owner = "client!kv",
      name = "y",
      descriptor = "I"
   )
   public static int field3773;
   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "I"
   )
   public static int field3775;

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(Lkfa;IZ[[I)V"
   )
   public class283(class632 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method2154(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         label32: {
            ++field3772;
            if (~class417.field5859 != -2) {
               if (class417.field5859 != 2) {
                  break label32;
               }

               if (class775.field11283) {
                  class346.method2733(class291.method2190(90) + arg1, -773, class101.method916(-120) + arg2);
                  if (!var3) {
                     break label32;
                  }
               }

               class346.method2733(arg1, -773, arg2);
               if (!var3) {
                  break label32;
               }
            }

            class310.method2323(arg1, arg2, -2, class484.field6673);
         }

         if (arg0) {
            field3774 = null;
         }

         class484.field6673 = null;
         class417.field5859 = 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3776[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "b",
      descriptor = "(II)I"
   )
   public static int method2155(int arg0, int arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3776[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2156(boolean arg0) {
      try {
         field3774 = null;
         if (!arg0) {
            field3775 = 96;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3776[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ZLha;IB)Lfj;"
   )
   public static final class686 method2157(boolean arg0, class65 arg1, int arg2, byte arg3) {
      boolean var4 = client.field4273;

      try {
         ++field3773;
         if (arg2 == -1) {
            return null;
         } else {
            if (class671.field9873 != null) {
               int var5 = 0;
               if (var4 || ~var5 > ~class671.field9873.length) {
                  do {
                     if (~class671.field9873[var5] == ~arg2) {
                        return class271.field3594[var5];
                     }

                     ++var5;
                  } while(~var5 > ~class671.field9873.length);
               }
            }

            class686 var6 = (class686)class17.field235.method4239((long)arg2, 0);
            if (var6 != null) {
               if (arg0 && var6.field10068 == null) {
                  class663 var7 = class287.method2176(arg2, 22, class14.field185);
                  if (var7 == null) {
                     return null;
                  }

                  var6.field10068 = var7;
               }

               return var6;
            } else {
               class267[] var8 = class267.method2046(class240.field2987, arg2);
               if (var8 == null) {
                  return null;
               } else {
                  class663 var9 = class287.method2176(arg2, -93, class14.field185);
                  if (var9 == null) {
                     return null;
                  } else {
                     class686 var10;
                     label54: {
                        if (!arg0) {
                           var10 = new class686(arg1.method496(var9, var8, true));
                           if (!var4) {
                              break label54;
                           }
                        }

                        var10 = new class686(arg1.method496(var9, var8, true), var9);
                     }

                     int var11 = 41 % ((arg3 - -45) / 38);
                     class17.field235.method4238(24, var10, (long)arg2);
                     return var10;
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3776[3] + arg0 + ',' + (arg1 != null ? field3776[1] : field3776[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
