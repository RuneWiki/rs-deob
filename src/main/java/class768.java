import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class768 {
   @OriginalMember(
      owner = "client!sia",
      name = "n",
      descriptor = "I"
   )
   private int field11314 = -1;
   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "Z"
   )
   private boolean field11312 = false;
   @OriginalMember(
      owner = "client!sia",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field11323 = new String[0];
   @OriginalMember(
      owner = "client!sia",
      name = "j",
      descriptor = "I"
   )
   private int field11321;
   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11326 = new String[]{method5565(method5564("qDH1 m~]m=lJ\u0001")), method5565(method5564(".\r")), method5565(method5564("qDH1\u0011*")), method5565(method5564("qDH1\u0013*")), method5565(method5564("lXEs")), method5565(method5564("y\u0003\u00071)")), method5565(method5564("qDH1\u0016*")), method5565(method5564("qDH1\u0017*")), method5565(method5564("qDH1hkC@kj*")), method5565(method5564("qDH1\u001d*")), method5565(method5564("qDH1\u0010*")), method5565(method5564("qDH1\u001c*")), method5565(method5564("qDH1\u0012*"))};
   @OriginalMember(
      owner = "client!sia",
      name = "k",
      descriptor = "I"
   )
   public static int field11318 = 1;
   @OriginalMember(
      owner = "client!sia",
      name = "g",
      descriptor = "I"
   )
   public static int field11313;
   @OriginalMember(
      owner = "client!sia",
      name = "c",
      descriptor = "I"
   )
   public static int field11315;
   @OriginalMember(
      owner = "client!sia",
      name = "l",
      descriptor = "I"
   )
   public static int field11316;
   @OriginalMember(
      owner = "client!sia",
      name = "m",
      descriptor = "I"
   )
   public static int field11319;
   @OriginalMember(
      owner = "client!sia",
      name = "f",
      descriptor = "I"
   )
   public static int field11320;
   @OriginalMember(
      owner = "client!sia",
      name = "d",
      descriptor = "I"
   )
   public static int field11322;
   @OriginalMember(
      owner = "client!sia",
      name = "h",
      descriptor = "I"
   )
   public static int field11324;
   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "I"
   )
   public static int field11325;
   @OriginalMember(
      owner = "client!sia",
      name = "i",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field11317;

   @OriginalMember(
      owner = "client!sia",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 5
   )
   public final String toString() {
      boolean var1 = client.field4360;

      try {
         ++field11325;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1) {
            if (~var3 != -1) {
               var2.append(field11326[1]);
            }

            var2.append(this.field11323[var3]);
            ++var3;
         }

         while(true) {
            while(this.field11314 > var3) {
               if (~var3 != -1) {
                  var2.append(field11326[1]);
               }

               var2.append(this.field11323[var3]);
               ++var3;
            }

            var2.append("]");
            if (!var1) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11326[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IIILsv;Lsv;)V",
      line = 32
   )
   public static final void method5555(int arg0, int arg1, int arg2, class688 arg3, class688 arg4) {
      class517 var5 = class179.method1431(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field7476 = arg3;
         var5.field7469 = arg4;
         int var6 = class757.field11220 == class731.field10698 ? 1 : 0;
         if (arg3.method253((byte)-125)) {
            if (arg3.method238((byte)94)) {
               arg3.field10695 = class392.field5677[var6];
               class392.field5677[var6] = arg3;
            } else {
               arg3.field10695 = class591.field8705[var6];
               class591.field8705[var6] = arg3;
               class171.field2384 = true;
            }
         } else {
            arg3.field10695 = class756.field11204[var6];
            class756.field11204[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method253((byte)-127)) {
               if (arg4.method238((byte)118)) {
                  arg4.field10695 = class392.field5677[var6];
                  class392.field5677[var6] = arg4;
                  return;
               }

               arg4.field10695 = class591.field8705[var6];
               class591.field8705[var6] = arg4;
               class171.field2384 = true;
               return;
            }

            arg4.field10695 = class756.field11204[var6];
            class756.field11204[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!sia",
      name = "<init>",
      descriptor = "(IZ)V",
      line = 242
   )
   public class768(int arg0, boolean arg1) {
      try {
         this.field11321 = arg0;
         this.field11312 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11326[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "(II)I",
      line = 97
   )
   private final int method5556(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field11320;
         if (arg1 != 23572) {
            method5561(66, -65);
         }

         int var4 = this.field11323.length;
         int var10000;
         if (var3) {
            var10000 = this.field11312;
         } else if (~arg0 > ~var4) {
            var10000 = var4;
            if (!var3) {
               return var4;
            }
         } else {
            var10000 = this.field11312;
         }

         while(true) {
            if (var10000 == 0) {
               var4 += this.field11321;
               if (var3) {
                  if (~var4 == -1) {
                     var4 = 1;
                     if (var3) {
                        var4 = this.field11321 * var4;
                     }
                  } else {
                     var4 = this.field11321 * var4;
                  }
               }
            } else if (~var4 == -1) {
               var4 = 1;
               if (var3) {
                  var4 = this.field11321 * var4;
               }
            } else {
               var4 = this.field11321 * var4;
            }

            if (~arg0 > ~var4) {
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = this.field11312;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11326[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(I)V",
      line = 133
   )
   public static void method5557(int arg0) {
      try {
         field11317 = null;
         if (arg0 != 19507) {
            field11318 = 119;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11326[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 143
   )
   public final void method5558(String arg0, int arg1) {
      try {
         ++field11315;
         this.method5562(0, arg0, this.field11314 + arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11326[9] + (arg0 != null ? field11326[5] : field11326[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(BII)V",
      line = 151
   )
   public static final void method5559(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 > -14) {
            method5561(108, 45);
         }

         ++field11322;
         class755 var3 = class317.method2325((long)arg2, 127, 5);
         var3.method5479(1288);
         var3.field11184 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11326[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(Z)[Ljava/lang/String;",
      line = 169
   )
   public final String[] method5560(boolean arg0) {
      try {
         ++field11316;
         String[] var2 = new String[this.field11314 + 1];
         class242.method1847(this.field11323, 0, var2, 0, this.field11314 - -1);
         return !arg0 ? null : var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11326[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "c",
      descriptor = "(II)V",
      line = 185
   )
   public static final void method5561(int arg0, int arg1) {
      try {
         ++field11313;
         if (arg0 != 0) {
            method5557(52);
         }

         class755 var2 = class317.method2325((long)arg1, arg0 + 120, 16);
         var2.method5481(-116);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11326[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V",
      line = 202
   )
   private final void method5562(int arg0, String arg1, int arg2) {
      try {
         ++field11324;
         if (this.field11314 < arg2) {
            this.field11314 = arg2;
         }

         if (arg2 >= this.field11323.length) {
            this.method5563(-127, arg2);
         }

         if (arg0 == 0) {
            this.field11323[arg2] = arg1;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11326[3] + arg0 + ',' + (arg1 != null ? field11326[5] : field11326[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(II)V",
      line = 229
   )
   private final void method5563(int arg0, int arg1) {
      try {
         ++field11319;
         String[] var3 = new String[this.method5556(arg1, 23572)];
         class242.method1847(this.field11323, 0, var3, 0, this.field11323.length);
         if (arg0 >= -119) {
            this.field11314 = -60;
         }

         this.field11323 = var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11326[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5564(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5565(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
