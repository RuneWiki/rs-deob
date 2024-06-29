import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class106 extends class76 {
   @OriginalMember(
      owner = "client!qu",
      name = "D",
      descriptor = "I"
   )
   private int field1340;
   @OriginalMember(
      owner = "client!qu",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1345 = new String[]{method876(method875(",\u001b\b n")), method876(method875(",\u001b\b$n")), method876(method875(",\u001b\b#n")), method876(method875(",\u001b\b/n")), method876(method875(",\u001b\b[/3\u0007RYn")), method876(method875(",\u001b\b%n")), method876(method875(",\u001b\b\"n")), method876(method875("3\u001bJ\u000b")), method876(method875("&@\bI;")), method876(method875(",\u001b\b&n")), method876(method875(",\u001b\b!n"))};
   @OriginalMember(
      owner = "client!qu",
      name = "H",
      descriptor = "I"
   )
   public static int field1332;
   @OriginalMember(
      owner = "client!qu",
      name = "J",
      descriptor = "I"
   )
   public static int field1334;
   @OriginalMember(
      owner = "client!qu",
      name = "L",
      descriptor = "I"
   )
   public static int field1335;
   @OriginalMember(
      owner = "client!qu",
      name = "K",
      descriptor = "I"
   )
   public static int field1336;
   @OriginalMember(
      owner = "client!qu",
      name = "C",
      descriptor = "I"
   )
   public static int field1337;
   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "I"
   )
   public static int field1338;
   @OriginalMember(
      owner = "client!qu",
      name = "A",
      descriptor = "I"
   )
   public static int field1342;
   @OriginalMember(
      owner = "client!qu",
      name = "E",
      descriptor = "I"
   )
   public static int field1343;
   @OriginalMember(
      owner = "client!qu",
      name = "G",
      descriptor = "Lus;"
   )
   public static class1 field1344;
   @OriginalMember(
      owner = "client!qu",
      name = "I",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1333;
   @OriginalMember(
      owner = "client!qu",
      name = "B",
      descriptor = "[Lpw;"
   )
   public class736[] field1341;
   @OriginalMember(
      owner = "client!qu",
      name = "F",
      descriptor = "[[B"
   )
   private byte[][] field1339;

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(Lha;ILdea;III)V"
   )
   public static final void method867(class66 arg0, int arg1, class259 arg2, int arg3, int arg4, int arg5) {
      try {
         ++field1343;
         class681 var6 = class294.field4046.method4597(31352, arg2.field3554);
         if (var6.field10027 != -1) {
            label50: {
               if (!arg2.field3580) {
                  arg4 = 0;
                  if (!client.field4360) {
                     break label50;
                  }
               }

               arg4 += arg2.field3574;
               arg4 &= 3;
            }

            class492 var7 = var6.method4966(arg0, arg5 + -26927, arg4, arg2.field3567);
            if (var7 != null) {
               int var8 = arg2.field3595;
               if (arg5 != 27040) {
                  field1344 = null;
               }

               int var9 = arg2.field3583;
               if (~(1 & arg4) == -2) {
                  var9 = arg2.field3595;
                  var8 = arg2.field3583;
               }

               int var10 = var7.method960();
               int var11 = var7.method957();
               if (var6.field10033) {
                  var11 = var9 * 4;
                  var10 = var8 * 4;
               }

               if (var6.field10023 != 0) {
                  var7.method3570(arg3, -((var9 + -1) * 4) + arg1, var10, var11, 0, -16777216 | var6.field10023, 1);
               } else {
                  var7.method3577(arg3, 4 - var9 * 4 + arg1, var10, var11);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1345[9] + (arg0 != null ? field1345[8] : field1345[7]) + ',' + arg1 + ',' + (arg2 != null ? field1345[8] : field1345[7]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method868(int arg0) {
      boolean var1 = client.field4360;

      try {
         label28: {
            if (class314.field4289 == null) {
               if (class203.field2883 == -1) {
                  class647.method4717(class686.field10122, class750.field11103, class284.field3931, false);
                  if (!var1) {
                     break label28;
                  }
               }

               class533.method3838(class686.field10122, arg0 ^ 29954);
               if (!var1) {
                  break label28;
               }
            }

            class43.method366(arg0 + 30351, class686.field10122);
         }

         ++field1337;
         if (arg0 != -3965) {
            method871(-5);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1345[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public final boolean method869(int arg0, boolean arg1) {
      try {
         ++field1342;
         return !arg1 ? false : this.field1341[arg0].field10759;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1345[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "b",
      descriptor = "(BI)[B"
   )
   public static final byte[] method870(byte arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         if (arg0 <= 6) {
            return null;
         } else {
            ++field1334;
            class465 var3 = (class465)class388.field5633.method5069((byte)-113, (long)arg1);
            if (var3 == null) {
               byte[] var4 = new byte[512];
               Random var5 = new Random((long)arg1);
               int var6 = 0;
               if (var2) {
                  var4[var6] = (byte)var6;
                  ++var6;
               }

               while(true) {
                  while(var6 < 255) {
                     var4[var6] = (byte)var6;
                     ++var6;
                  }

                  int var7 = 0;
                  if (!var2) {
                     if (var2 || var7 < 255) {
                        do {
                           int var8 = -var7 + 255;
                           int var9 = class258.method1968((byte)-90, var5, var8);
                           byte var10 = var4[var9];
                           var4[var9] = var4[var8];
                           var4[var8] = var4[-var7 + 511] = var10;
                           ++var7;
                        } while(var7 < 255);
                     }

                     var3 = new class465(var4);
                     class388.field5633.method5068((long)arg1, var3, -36);
                     break;
                  }

                  ++var6;
               }
            }

            return var3.field6713;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1345[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method871(int arg0) {
      try {
         field1344 = null;
         field1333 = null;
         if (arg0 != 3) {
            method871(32);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1345[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(BI)Z"
   )
   public final boolean method872(byte arg0, int arg1) {
      try {
         if (arg0 != 51) {
            field1333 = null;
         }

         ++field1332;
         return this.field1341[arg1].field10749;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1345[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method873(int arg0, int arg1) {
      try {
         ++field1338;
         if (arg0 != 0) {
            field1344 = null;
         }

         return this.field1341[arg1].field10757;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1345[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class106(int arg0) {
      try {
         this.field1340 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1345[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method874(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method875(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method876(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
