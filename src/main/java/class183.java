import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class183 implements class51 {
   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2888 = new String[]{method1664(method1663("ys\u001aD")), method1664(method1663("xmXlv")), method1664(method1663("l(X\u0006#")), method1664(method1663("xmXnv")), method1664(method1663("xmXov")), method1664(method1663("xmXiv")), method1664(method1663("xmXkv")), method1664(method1663("xmXmv")), method1664(method1663("xmXjv"))};
   @OriginalMember(
      owner = "client!ok",
      name = "q",
      descriptor = "I"
   )
   public int field2871;
   @OriginalMember(
      owner = "client!ok",
      name = "l",
      descriptor = "I"
   )
   public int field2872;
   @OriginalMember(
      owner = "client!ok",
      name = "o",
      descriptor = "I"
   )
   public static int field2873;
   @OriginalMember(
      owner = "client!ok",
      name = "p",
      descriptor = "I"
   )
   public static int field2874;
   @OriginalMember(
      owner = "client!ok",
      name = "e",
      descriptor = "I"
   )
   public int field2875;
   @OriginalMember(
      owner = "client!ok",
      name = "j",
      descriptor = "I"
   )
   public int field2876;
   @OriginalMember(
      owner = "client!ok",
      name = "m",
      descriptor = "I"
   )
   public static int field2877;
   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "I"
   )
   public static int field2880;
   @OriginalMember(
      owner = "client!ok",
      name = "g",
      descriptor = "I"
   )
   public static int field2881;
   @OriginalMember(
      owner = "client!ok",
      name = "i",
      descriptor = "I"
   )
   public int field2882;
   @OriginalMember(
      owner = "client!ok",
      name = "f",
      descriptor = "I"
   )
   public static int field2883;
   @OriginalMember(
      owner = "client!ok",
      name = "d",
      descriptor = "I"
   )
   public int field2885;
   @OriginalMember(
      owner = "client!ok",
      name = "k",
      descriptor = "I"
   )
   public static int field2886;
   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "I"
   )
   public static int field2887;
   @OriginalMember(
      owner = "client!ok",
      name = "n",
      descriptor = "Z"
   )
   public boolean field2884;
   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2878;
   @OriginalMember(
      owner = "client!ok",
      name = "h",
      descriptor = "[[S"
   )
   public static short[][] field2879;

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(II)Lfq;"
   )
   public static final class374 method1658(int arg0, int arg1) {
      try {
         ++field2881;
         int var2 = arg0 >> 16;
         if (arg1 < 109) {
            field2879 = null;
         }

         int var3 = arg0 & 65535;
         if (class296.field4672[var2] == null || class296.field4672[var2][var3] == null) {
            boolean var4 = client.method1170(var2, (byte)-119);
            if (!var4) {
               return null;
            }
         }

         return class296.field4672[var2][var3];
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2888[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(Lln;ZLln;IZZI)I"
   )
   public static final int method1659(class433 arg0, boolean arg1, class433 arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
      try {
         ++field2874;
         if (arg1) {
            field2879 = null;
         }

         int var7 = class153.method1391(arg6, arg0, -122, arg2, arg5);
         if (~var7 != -1) {
            return !arg5 ? var7 : -var7;
         } else if (arg3 == -1) {
            return 0;
         } else {
            int var8 = class153.method1391(arg3, arg0, -70, arg2, arg4);
            return arg4 ? -var8 : var8;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2888[1] + (arg0 != null ? field2888[2] : field2888[0]) + ',' + arg1 + ',' + (arg2 != null ? field2888[2] : field2888[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1660(byte arg0) {
      try {
         int var1 = 88 / ((arg0 - -14) / 55);
         ++field2886;
         class669.method4931(-28824);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2888[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method350(int arg0) {
      try {
         ++field2877;
         long[] var2 = class717.field10745;
         long var3 = -1L;
         long var5 = var2[(int)(((long)this.field2882 ^ var3) & 255L)] ^ var3 >>> 8;
         long var7 = var2[(int)(((long)(this.field2885 >> 8) ^ var5) & 255L)] ^ var5 >>> 8;
         long var9 = var7 >>> 8 ^ var2[(int)(255L & ((long)this.field2885 ^ var7))];
         long var11 = var2[(int)((var9 ^ (long)(this.field2875 >> 24)) & 255L)] ^ var9 >>> 8;
         long var13 = var2[(int)((var11 ^ (long)(this.field2875 >> 16)) & 255L)] ^ var11 >>> 8;
         long var15 = var13 >>> 8 ^ var2[(int)(255L & ((long)(this.field2875 >> 8) ^ var13))];
         long var17 = var2[(int)(((long)this.field2875 ^ var15) & 255L)] ^ var15 >>> 8;
         long var19 = var17 >>> 8 ^ var2[(int)(255L & (var17 ^ (long)this.field2871))];
         long var21 = var2[(int)(((long)(this.field2876 >> 24) ^ var19) & 255L)] ^ var19 >>> 8;
         if (arg0 != -10416) {
            field2883 = -122;
         }

         long var23 = var2[(int)(255L & ((long)(this.field2876 >> 16) ^ var21))] ^ var21 >>> 8;
         long var25 = var23 >>> 8 ^ var2[(int)(255L & ((long)(this.field2876 >> 8) ^ var23))];
         long var27 = var25 >>> 8 ^ var2[(int)(255L & (var25 ^ (long)this.field2876))];
         long var29 = var27 >>> 8 ^ var2[(int)(((long)this.field2872 ^ var27) & 255L)];
         return var2[(int)(255L & (var29 ^ (long)(this.field2884 ? 1 : 0)))] ^ var29 >>> 8;
      } catch (RuntimeException var34) {
         throw class482.method3757(var34, field2888[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1661(int arg0) {
      try {
         field2879 = null;
         field2878 = null;
         int var1 = 73 % ((arg0 - -57) / 58);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2888[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "([BI)V"
   )
   public static final void method1662(byte[] arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field2880;
         if (arg1 != -24048) {
            field2883 = -53;
         }

         class354 var3 = new class354(arg0);

         while(true) {
            label84:
            while(true) {
               int var4;
               do {
                  var4 = var3.method2855(arg1 + -6959);
                  if (~var4 == -1) {
                     if (!var2) {
                        return;
                     }
                     break;
                  }

                  if (var4 != 1) {
                     break;
                  }

                  int[] var5 = class202.field3086 = new int[6];
                  var5[0] = var3.method2848(-126);
                  var5[1] = var3.method2848(-122);
                  var5[2] = var3.method2848(-122);
                  var5[3] = var3.method2848(-124);
                  var5[4] = var3.method2848(-125);
                  var5[5] = var3.method2848(-98);
               } while(!var2);

               if (~var4 == -5) {
                  break;
               }

               if (var4 == 5) {
                  int var6 = var3.method2855(arg1 ^ 9457);
                  class645.field9309 = new int[var6];
                  int var7 = 0;
                  if (var2) {
                     class645.field9309[var7] = var3.method2848(-98);
                     if (~class645.field9309[var7] == -65536) {
                        class645.field9309[var7] = -1;
                     }

                     ++var7;
                  }

                  while(true) {
                     if (var6 <= var7) {
                        if (!var2) {
                           if (var2) {
                              break label84;
                           }
                           break;
                        }
                     } else {
                        class645.field9309[var7] = var3.method2848(-98);
                     }

                     if (~class645.field9309[var7] == -65536) {
                        class645.field9309[var7] = -1;
                     }

                     ++var7;
                  }
               }
            }

            int var8 = var3.method2855(-31007);
            class678.field10121 = new int[var8];
            int var9 = 0;
            if (var2) {
               class678.field10121[var9] = var3.method2848(arg1 + 23930);
               if (~class678.field10121[var9] == -65536) {
                  class678.field10121[var9] = -1;
               }

               ++var9;
            }

            while(true) {
               if (var9 >= var8) {
                  if (!var2) {
                     break;
                  }
               } else {
                  class678.field10121[var9] = var3.method2848(arg1 + 23930);
               }

               if (~class678.field10121[var9] == -65536) {
                  class678.field10121[var9] = -1;
               }

               ++var9;
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2888[3] + (arg0 != null ? field2888[2] : field2888[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(Lic;Z)Z"
   )
   public final boolean method349(class51 arg0, boolean arg1) {
      try {
         ++field2873;
         if (!(arg0 instanceof class183)) {
            return false;
         } else {
            class183 var3 = (class183)arg0;
            if (!arg1) {
               return false;
            } else if (this.field2882 != var3.field2882) {
               return false;
            } else if (~this.field2885 != ~var3.field2885) {
               return false;
            } else if (this.field2875 != var3.field2875) {
               return false;
            } else if (~this.field2871 != ~var3.field2871) {
               return false;
            } else if (this.field2876 != var3.field2876) {
               return false;
            } else if (this.field2872 != var3.field2872) {
               return false;
            } else {
               return !this.field2884 != var3.field2884;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2888[5] + (arg0 != null ? field2888[2] : field2888[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1663(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1664(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
