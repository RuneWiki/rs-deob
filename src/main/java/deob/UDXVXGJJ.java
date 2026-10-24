package deob;

@ObfuscatedName("UDXVXGJJ")
public class UDXVXGJJ {

	@ObfuscatedName("UDXVXGJJ.f")
	public int field1276 = 0;

	@ObfuscatedName("UDXVXGJJ.g")
	public int field1277 = 0;

	@ObfuscatedName("UDXVXGJJ.h")
	public int field1278;

	@ObfuscatedName("UDXVXGJJ.i")
	public int field1279;

	@ObfuscatedName("UDXVXGJJ.j")
	public int[][] field1280;

	public UDXVXGJJ(int arg0, int arg1) {
		field1278 = arg1;
		field1279 = arg0;
		field1280 = new int[field1278][field1279];
		method515();
	}

	@ObfuscatedName("UDXVXGJJ.a()V")
	public void method515() {
		for (int var1 = 0; var1 < field1278; var1++) {
			for (int var2 = 0; var2 < field1279; var2++) {
				if (var1 == 0 || var2 == 0 || field1278 - 1 == var1 || field1279 - 1 == var2) {
					field1280[var1][var2] = 0xFFFFFF;
				} else {
					field1280[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("UDXVXGJJ.a(ZIIZII)V")
	public void method516(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1276;
		arg4 -= field1277;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method519(arg3, arg4, 128);
				method519(arg3 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method519(arg3, arg4, 2);
				method519(arg3, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method519(arg3, arg4, 8);
				method519(arg3 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method519(arg3, arg4, 32);
				method519(arg3, arg4 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method519(arg3, arg4, 1);
				method519(arg3 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method519(arg3, arg4, 4);
				method519(arg3 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method519(arg3, arg4, 16);
				method519(arg3 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method519(arg3, arg4, 64);
				method519(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method519(arg3, arg4, 130);
				method519(arg3 - 1, arg4, 8);
				method519(arg3, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method519(arg3, arg4, 10);
				method519(arg3, arg4 + 1, 32);
				method519(arg3 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method519(arg3, arg4, 40);
				method519(arg3 + 1, arg4, 128);
				method519(arg3, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method519(arg3, arg4, 160);
				method519(arg3, arg4 - 1, 2);
				method519(arg3 - 1, arg4, 8);
			}
		}

		if (arg0) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method519(arg3, arg4, 0x10000);
					method519(arg3 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method519(arg3, arg4, 1024);
					method519(arg3, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method519(arg3, arg4, 4096);
					method519(arg3 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method519(arg3, arg4, 16384);
					method519(arg3, arg4 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method519(arg3, arg4, 512);
					method519(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method519(arg3, arg4, 2048);
					method519(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method519(arg3, arg4, 8192);
					method519(arg3 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method519(arg3, arg4, 32768);
					method519(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method519(arg3, arg4, 66560);
					method519(arg3 - 1, arg4, 4096);
					method519(arg3, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method519(arg3, arg4, 5120);
					method519(arg3, arg4 + 1, 16384);
					method519(arg3 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method519(arg3, arg4, 20480);
					method519(arg3 + 1, arg4, 0x10000);
					method519(arg3, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method519(arg3, arg4, 81920);
					method519(arg3, arg4 - 1, 1024);
					method519(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("UDXVXGJJ.a(IIIIZII)V")
	public void method517(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg5 -= field1276;
		arg0 -= field1277;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg5; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1278) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field1279) {
						method519(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("UDXVXGJJ.a(III)V")
	public void method518(int arg0, int arg1) {
		arg1 -= field1276;
		arg0 -= field1277;
		field1280[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("UDXVXGJJ.b(III)V")
	public void method519(int arg0, int arg1, int arg2) {
		field1280[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("UDXVXGJJ.a(ZIIIII)V")
	public void method520(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1276;
		arg3 -= field1277;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method522(arg3, 128, arg2);
				method522(arg3, 8, arg2 - 1);
			}

			if (arg1 == 1) {
				method522(arg3, 2, arg2);
				method522(arg3 + 1, 32, arg2);
			}

			if (arg1 == 2) {
				method522(arg3, 8, arg2);
				method522(arg3, 128, arg2 + 1);
			}

			if (arg1 == 3) {
				method522(arg3, 32, arg2);
				method522(arg3 - 1, 2, arg2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method522(arg3, 1, arg2);
				method522(arg3 + 1, 16, arg2 - 1);
			}

			if (arg1 == 1) {
				method522(arg3, 4, arg2);
				method522(arg3 + 1, 64, arg2 + 1);
			}

			if (arg1 == 2) {
				method522(arg3, 16, arg2);
				method522(arg3 - 1, 1, arg2 + 1);
			}

			if (arg1 == 3) {
				method522(arg3, 64, arg2);
				method522(arg3 - 1, 4, arg2 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method522(arg3, 130, arg2);
				method522(arg3, 8, arg2 - 1);
				method522(arg3 + 1, 32, arg2);
			}

			if (arg1 == 1) {
				method522(arg3, 10, arg2);
				method522(arg3 + 1, 32, arg2);
				method522(arg3, 128, arg2 + 1);
			}

			if (arg1 == 2) {
				method522(arg3, 40, arg2);
				method522(arg3, 128, arg2 + 1);
				method522(arg3 - 1, 2, arg2);
			}

			if (arg1 == 3) {
				method522(arg3, 160, arg2);
				method522(arg3 - 1, 2, arg2);
				method522(arg3, 8, arg2 - 1);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method522(arg3, 0x10000, arg2);
					method522(arg3, 4096, arg2 - 1);
				}

				if (arg1 == 1) {
					method522(arg3, 1024, arg2);
					method522(arg3 + 1, 16384, arg2);
				}

				if (arg1 == 2) {
					method522(arg3, 4096, arg2);
					method522(arg3, 0x10000, arg2 + 1);
				}

				if (arg1 == 3) {
					method522(arg3, 16384, arg2);
					method522(arg3 - 1, 1024, arg2);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method522(arg3, 512, arg2);
					method522(arg3 + 1, 8192, arg2 - 1);
				}

				if (arg1 == 1) {
					method522(arg3, 2048, arg2);
					method522(arg3 + 1, 32768, arg2 + 1);
				}

				if (arg1 == 2) {
					method522(arg3, 8192, arg2);
					method522(arg3 - 1, 512, arg2 + 1);
				}

				if (arg1 == 3) {
					method522(arg3, 32768, arg2);
					method522(arg3 - 1, 2048, arg2 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method522(arg3, 66560, arg2);
					method522(arg3, 4096, arg2 - 1);
					method522(arg3 + 1, 16384, arg2);
				}

				if (arg1 == 1) {
					method522(arg3, 5120, arg2);
					method522(arg3 + 1, 16384, arg2);
					method522(arg3, 0x10000, arg2 + 1);
				}

				if (arg1 == 2) {
					method522(arg3, 20480, arg2);
					method522(arg3, 0x10000, arg2 + 1);
					method522(arg3 - 1, 1024, arg2);
				}

				if (arg1 == 3) {
					method522(arg3, 81920, arg2);
					method522(arg3 - 1, 1024, arg2);
					method522(arg3, 4096, arg2 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("UDXVXGJJ.a(IIZIIII)V")
	public void method521(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg5 -= field1276;
		arg0 -= field1277;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1278) {
				for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1279) {
						method522(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("UDXVXGJJ.a(BIII)V")
	public void method522(int arg0, int arg1, int arg2) {
		field1280[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("UDXVXGJJ.a(ZII)V")
	public void method523(int arg0, int arg1) {
		arg1 -= field1276;
		arg0 -= field1277;
		field1280[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("UDXVXGJJ.a(BIIIIII)Z")
	public boolean method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg3 == arg5) {
			return true;
		}

		arg0 -= field1276;
		arg3 -= field1277;
		arg1 -= field1276;
		arg5 -= field1277;
		if (arg4 == 0) {
			if (arg2 == 0) {
				if (arg1 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3 && (field1280[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3 && (field1280[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 == arg1 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg1 - 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3 && (field1280[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3 && (field1280[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 == arg1 && arg5 - 1 == arg3) {
					return true;
				}

				if (arg1 - 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				if (arg1 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3 && (field1280[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 - 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3 && (field1280[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 - 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3 && (field1280[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg3 && (field1280[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg1 && arg5 + 1 == arg3 && (field1280[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg5 - 1 == arg3 && (field1280[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg0 && arg3 == arg5 && (field1280[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("UDXVXGJJ.a(IIIIIII)Z")
	public boolean method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg1 == arg3) {
			return true;
		}

		arg5 -= field1276;
		arg1 -= field1277;
		arg4 -= field1276;
		arg3 -= field1277;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg4 + 1 == arg5 && arg1 == arg3 && (field1280[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg1 && (field1280[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg4 - 1 == arg5 && arg1 == arg3 && (field1280[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg1 && (field1280[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg4 - 1 == arg5 && arg1 == arg3 && (field1280[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg1 && (field1280[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg4 + 1 == arg5 && arg1 == arg3 && (field1280[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg1 && (field1280[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg4 == arg5 && arg3 + 1 == arg1 && (field1280[arg5][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg3 - 1 == arg1 && (field1280[arg5][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg1 == arg3 && (field1280[arg5][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg1 == arg3 && (field1280[arg5][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("UDXVXGJJ.a(BIIIIIII)Z")
	public boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg5 - 1;
		int var9 = arg1 + arg6 - 1;
		if (arg3 >= arg5 && arg3 <= var8 && arg4 >= arg6 && arg4 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg3 && arg4 >= arg6 && arg4 <= var9 && (field1280[arg3 - field1276][arg4 - field1277] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg4 >= arg6 && arg4 <= var9 && (field1280[arg3 - field1276][arg4 - field1277] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg4 && arg3 >= arg5 && arg3 <= var8 && (field1280[arg3 - field1276][arg4 - field1277] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg3 >= arg5 && arg3 <= var8 && (field1280[arg3 - field1276][arg4 - field1277] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
