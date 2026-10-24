package deob;

@ObfuscatedName("VLOWRGUJ")
public class VLOWRGUJ {

	@ObfuscatedName("VLOWRGUJ.i")
	public int field1319 = 0;

	@ObfuscatedName("VLOWRGUJ.j")
	public int field1320 = 0;

	@ObfuscatedName("VLOWRGUJ.k")
	public int field1321;

	@ObfuscatedName("VLOWRGUJ.l")
	public int field1322;

	@ObfuscatedName("VLOWRGUJ.m")
	public int[][] field1323;

	public VLOWRGUJ(int arg0, int arg1) {
		field1321 = arg1;
		field1322 = arg0;
		field1323 = new int[field1321][field1322];
		method552();
	}

	@ObfuscatedName("VLOWRGUJ.a()V")
	public void method552() {
		for (int var1 = 0; var1 < field1321; var1++) {
			for (int var2 = 0; var2 < field1322; var2++) {
				if (var1 == 0 || var2 == 0 || field1321 - 1 == var1 || field1322 - 1 == var2) {
					field1323[var1][var2] = 0xFFFFFF;
				} else {
					field1323[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("VLOWRGUJ.a(BIIIIZ)V")
	public void method553(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg0 -= field1319;
		arg3 -= field1320;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method556(arg0, arg3, 128);
				method556(arg0 - 1, arg3, 8);
			}

			if (arg2 == 1) {
				method556(arg0, arg3, 2);
				method556(arg0, arg3 + 1, 32);
			}

			if (arg2 == 2) {
				method556(arg0, arg3, 8);
				method556(arg0 + 1, arg3, 128);
			}

			if (arg2 == 3) {
				method556(arg0, arg3, 32);
				method556(arg0, arg3 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method556(arg0, arg3, 1);
				method556(arg0 - 1, arg3 + 1, 16);
			}

			if (arg2 == 1) {
				method556(arg0, arg3, 4);
				method556(arg0 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method556(arg0, arg3, 16);
				method556(arg0 + 1, arg3 - 1, 1);
			}

			if (arg2 == 3) {
				method556(arg0, arg3, 64);
				method556(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method556(arg0, arg3, 130);
				method556(arg0 - 1, arg3, 8);
				method556(arg0, arg3 + 1, 32);
			}

			if (arg2 == 1) {
				method556(arg0, arg3, 10);
				method556(arg0, arg3 + 1, 32);
				method556(arg0 + 1, arg3, 128);
			}

			if (arg2 == 2) {
				method556(arg0, arg3, 40);
				method556(arg0 + 1, arg3, 128);
				method556(arg0, arg3 - 1, 2);
			}

			if (arg2 == 3) {
				method556(arg0, arg3, 160);
				method556(arg0, arg3 - 1, 2);
				method556(arg0 - 1, arg3, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method556(arg0, arg3, 0x10000);
					method556(arg0 - 1, arg3, 4096);
				}

				if (arg2 == 1) {
					method556(arg0, arg3, 1024);
					method556(arg0, arg3 + 1, 16384);
				}

				if (arg2 == 2) {
					method556(arg0, arg3, 4096);
					method556(arg0 + 1, arg3, 0x10000);
				}

				if (arg2 == 3) {
					method556(arg0, arg3, 16384);
					method556(arg0, arg3 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method556(arg0, arg3, 512);
					method556(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg2 == 1) {
					method556(arg0, arg3, 2048);
					method556(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method556(arg0, arg3, 8192);
					method556(arg0 + 1, arg3 - 1, 512);
				}

				if (arg2 == 3) {
					method556(arg0, arg3, 32768);
					method556(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method556(arg0, arg3, 66560);
					method556(arg0 - 1, arg3, 4096);
					method556(arg0, arg3 + 1, 16384);
				}

				if (arg2 == 1) {
					method556(arg0, arg3, 5120);
					method556(arg0, arg3 + 1, 16384);
					method556(arg0 + 1, arg3, 0x10000);
				}

				if (arg2 == 2) {
					method556(arg0, arg3, 20480);
					method556(arg0 + 1, arg3, 0x10000);
					method556(arg0, arg3 - 1, 1024);
				}

				if (arg2 == 3) {
					method556(arg0, arg3, 81920);
					method556(arg0, arg3 - 1, 1024);
					method556(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("VLOWRGUJ.a(IIIIIIZ)V")
	public void method554(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field1319;
		arg1 -= field1320;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg4; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1321) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1322) {
						method556(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("VLOWRGUJ.a(III)V")
	public void method555(int arg0, int arg1) {
		arg1 -= field1319;
		arg0 -= field1320;
		field1323[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("VLOWRGUJ.b(III)V")
	public void method556(int arg0, int arg1, int arg2) {
		field1323[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("VLOWRGUJ.a(IZIIZI)V")
	public void method557(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field1319;
		arg2 -= field1320;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method559(arg4, 128, arg2);
				method559(arg4 - 1, 8, arg2);
			}

			if (arg3 == 1) {
				method559(arg4, 2, arg2);
				method559(arg4, 32, arg2 + 1);
			}

			if (arg3 == 2) {
				method559(arg4, 8, arg2);
				method559(arg4 + 1, 128, arg2);
			}

			if (arg3 == 3) {
				method559(arg4, 32, arg2);
				method559(arg4, 2, arg2 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method559(arg4, 1, arg2);
				method559(arg4 - 1, 16, arg2 + 1);
			}

			if (arg3 == 1) {
				method559(arg4, 4, arg2);
				method559(arg4 + 1, 64, arg2 + 1);
			}

			if (arg3 == 2) {
				method559(arg4, 16, arg2);
				method559(arg4 + 1, 1, arg2 - 1);
			}

			if (arg3 == 3) {
				method559(arg4, 64, arg2);
				method559(arg4 - 1, 4, arg2 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method559(arg4, 130, arg2);
				method559(arg4 - 1, 8, arg2);
				method559(arg4, 32, arg2 + 1);
			}

			if (arg3 == 1) {
				method559(arg4, 10, arg2);
				method559(arg4, 32, arg2 + 1);
				method559(arg4 + 1, 128, arg2);
			}

			if (arg3 == 2) {
				method559(arg4, 40, arg2);
				method559(arg4 + 1, 128, arg2);
				method559(arg4, 2, arg2 - 1);
			}

			if (arg3 == 3) {
				method559(arg4, 160, arg2);
				method559(arg4, 2, arg2 - 1);
				method559(arg4 - 1, 8, arg2);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method559(arg4, 0x10000, arg2);
					method559(arg4 - 1, 4096, arg2);
				}

				if (arg3 == 1) {
					method559(arg4, 1024, arg2);
					method559(arg4, 16384, arg2 + 1);
				}

				if (arg3 == 2) {
					method559(arg4, 4096, arg2);
					method559(arg4 + 1, 0x10000, arg2);
				}

				if (arg3 == 3) {
					method559(arg4, 16384, arg2);
					method559(arg4, 1024, arg2 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method559(arg4, 512, arg2);
					method559(arg4 - 1, 8192, arg2 + 1);
				}

				if (arg3 == 1) {
					method559(arg4, 2048, arg2);
					method559(arg4 + 1, 32768, arg2 + 1);
				}

				if (arg3 == 2) {
					method559(arg4, 8192, arg2);
					method559(arg4 + 1, 512, arg2 - 1);
				}

				if (arg3 == 3) {
					method559(arg4, 32768, arg2);
					method559(arg4 - 1, 2048, arg2 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method559(arg4, 66560, arg2);
					method559(arg4 - 1, 4096, arg2);
					method559(arg4, 16384, arg2 + 1);
				}

				if (arg3 == 1) {
					method559(arg4, 5120, arg2);
					method559(arg4, 16384, arg2 + 1);
					method559(arg4 + 1, 0x10000, arg2);
				}

				if (arg3 == 2) {
					method559(arg4, 20480, arg2);
					method559(arg4 + 1, 0x10000, arg2);
					method559(arg4, 1024, arg2 - 1);
				}

				if (arg3 == 3) {
					method559(arg4, 81920, arg2);
					method559(arg4, 1024, arg2 - 1);
					method559(arg4 - 1, 4096, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("VLOWRGUJ.a(IIIIZII)V")
	public void method558(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg0 -= field1319;
		arg1 -= field1320;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1321) {
				for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1322) {
						method559(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("VLOWRGUJ.a(IIII)V")
	public void method559(int arg0, int arg1, int arg2) {
		field1323[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("VLOWRGUJ.a(IIZ)V")
	public void method560(int arg0, int arg1) {
		arg1 -= field1319;
		arg0 -= field1320;
		field1323[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("VLOWRGUJ.a(IIIIIII)Z")
	public boolean method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg0 == arg2) {
			return true;
		}

		arg1 -= field1319;
		arg0 -= field1320;
		arg5 -= field1319;
		arg2 -= field1320;
		if (arg3 == 0) {
			if (arg4 == 0) {
				if (arg5 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg0 && (field1323[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg0 && (field1323[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 == arg5 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg5 - 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg5 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg0 && (field1323[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg0 && (field1323[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 == arg5 && arg2 - 1 == arg0) {
					return true;
				}

				if (arg5 - 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg4 == 0) {
				if (arg5 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg5 + 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg0 && (field1323[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg5 - 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg5 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg0 && (field1323[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg5 - 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg0 && (field1323[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg5 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg0 && (field1323[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg1 == arg5 && arg2 + 1 == arg0 && (field1323[arg1][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg2 - 1 == arg0 && (field1323[arg1][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg1 && arg0 == arg2 && (field1323[arg1][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("VLOWRGUJ.a(ZIIIIII)Z")
	public boolean method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg2 == arg4) {
			return true;
		}

		arg3 -= field1319;
		arg4 -= field1320;
		arg5 -= field1319;
		arg2 -= field1320;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}

			if (arg1 == 0) {
				if (arg5 + 1 == arg3 && arg2 == arg4 && (field1323[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg4 && (field1323[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg5 - 1 == arg3 && arg2 == arg4 && (field1323[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg4 && (field1323[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 - 1 == arg3 && arg2 == arg4 && (field1323[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg4 && (field1323[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg5 + 1 == arg3 && arg2 == arg4 && (field1323[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg4 && (field1323[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg3 == arg5 && arg2 + 1 == arg4 && (field1323[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg2 - 1 == arg4 && (field1323[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg3 && arg2 == arg4 && (field1323[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg3 && arg2 == arg4 && (field1323[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("VLOWRGUJ.a(IIIIIIII)Z")
	public boolean method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg4 - 1;
		int var9 = arg1 + arg3 - 1;
		if (arg2 >= arg0 && arg2 <= var8 && arg5 >= arg3 && arg5 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg2 && arg5 >= arg3 && arg5 <= var9 && (field1323[arg2 - field1319][arg5 - field1320] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg5 >= arg3 && arg5 <= var9 && (field1323[arg2 - field1319][arg5 - field1320] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg5 && arg2 >= arg0 && arg2 <= var8 && (field1323[arg2 - field1319][arg5 - field1320] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg2 >= arg0 && arg2 <= var8 && (field1323[arg2 - field1319][arg5 - field1320] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
