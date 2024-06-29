import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class75 {
   @OriginalMember(
      owner = "client!sga",
      name = "l",
      descriptor = "I"
   )
   private int field1329 = -1;
   @OriginalMember(
      owner = "client!sga",
      name = "e",
      descriptor = "I"
   )
   private int field1318 = 0;
   @OriginalMember(
      owner = "client!sga",
      name = "f",
      descriptor = "Liw;"
   )
   private class332 field1325 = new class332();
   @OriginalMember(
      owner = "client!sga",
      name = "n",
      descriptor = "Z"
   )
   public boolean field1332 = false;
   @OriginalMember(
      owner = "client!sga",
      name = "d",
      descriptor = "I"
   )
   private int field1328;
   @OriginalMember(
      owner = "client!sga",
      name = "i",
      descriptor = "I"
   )
   private int field1324;
   @OriginalMember(
      owner = "client!sga",
      name = "p",
      descriptor = "[Lsf;"
   )
   private class547[] field1321;
   @OriginalMember(
      owner = "client!sga",
      name = "g",
      descriptor = "[[[I"
   )
   private int[][][] field1327;
   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1333 = new String[]{method788(method787("}U\n-!&")), method788(method787("}U\n-$&")), method788(method787("}U\n-^g\\\u0002w\\&")), method788(method787("}U\n-#&")), method788(method787("}U\n- &")), method788(method787("}U\n-&&")), method788(method787("}U\n-'&")), method788(method787("MS\u0005#\r`^\u0012#\u0010kF\u0019j\u0007xWKbBhG\u0007oBg_\nd\u0007.Q\n`\nk"))};
   @OriginalMember(
      owner = "client!sga",
      name = "j",
      descriptor = "[F"
   )
   public static float[] field1326 = new float[4];
   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "I"
   )
   public static int field1322 = 7000;
   @OriginalMember(
      owner = "client!sga",
      name = "q",
      descriptor = "I"
   )
   public static int field1316 = field1322;
   @OriginalMember(
      owner = "client!sga",
      name = "h",
      descriptor = "I"
   )
   public static int field1317;
   @OriginalMember(
      owner = "client!sga",
      name = "o",
      descriptor = "I"
   )
   public static int field1319;
   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "I"
   )
   public static int field1320;
   @OriginalMember(
      owner = "client!sga",
      name = "c",
      descriptor = "I"
   )
   public static int field1323;
   @OriginalMember(
      owner = "client!sga",
      name = "m",
      descriptor = "I"
   )
   public static int field1331;
   @OriginalMember(
      owner = "client!sga",
      name = "k",
      descriptor = "Lsfa;"
   )
   public static class723 field1330;

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(I)[[[I"
   )
   public final int[][][] method781(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field1323;
         if (arg0 != -623) {
            return null;
         } else if (~this.field1328 != ~this.field1324) {
            throw new RuntimeException(field1333[7]);
         } else {
            int var3 = 0;
            if (var2) {
               this.field1321[var3] = class261.field3680;
               ++var3;
            }

            while(true) {
               class75 var10000;
               if (var3 >= this.field1328) {
                  var10000 = this;
                  if (!var2) {
                     return this.field1327;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field1321[var3] = class261.field3680;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1333[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method782(byte arg0) {
      try {
         field1330 = null;
         field1326 = null;
         if (arg0 != 75) {
            method782((byte)7);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1333[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method783(int arg0, int arg1) {
      try {
         if (arg1 != -30555) {
            method783(51, 21);
         }

         ++field1320;
         if (arg0 < 96) {
            return 0;
         } else {
            return ~arg0 > -129 ? 2 : 3;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1333[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method784(int arg0, int arg1) {
      try {
         if (arg1 >= -77) {
            return 32;
         } else {
            ++field1319;
            return arg0 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1333[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method785(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 <= 27) {
            this.field1318 = -96;
         }

         ++field1317;
         if (~this.field1328 != ~this.field1324) {
            if (~this.field1328 == -2) {
               this.field1332 = this.field1329 != arg1;
               this.field1329 = arg1;
               return this.field1327[0];
            } else {
               class547 var4;
               label55: {
                  var4 = this.field1321[arg1];
                  if (var4 != null) {
                     this.field1332 = false;
                     if (!var3) {
                        break label55;
                     }
                  }

                  label40: {
                     this.field1332 = true;
                     if (~this.field1318 <= ~this.field1328) {
                        class547 var5 = (class547)this.field1325.method2586((byte)116);
                        var4 = new class547(arg1, var5.field7910);
                        this.field1321[var5.field7909] = null;
                        var5.method154(49);
                        if (!var3) {
                           break label40;
                        }
                     }

                     var4 = new class547(arg1, this.field1318);
                     ++this.field1318;
                  }

                  this.field1321[arg1] = var4;
               }

               this.field1325.method2578(119, var4);
               return this.field1327[var4.field7910];
            }
         } else {
            this.field1332 = this.field1321[arg1] == null;
            this.field1321[arg1] = class261.field3680;
            return this.field1327[arg1];
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1333[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method786(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sga",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class75(int arg0, int arg1, int arg2) {
      try {
         this.field1328 = arg0;
         this.field1324 = arg1;
         this.field1321 = new class547[this.field1324];
         this.field1327 = new int[this.field1328][3][arg2];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1333[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method787(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method788(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
